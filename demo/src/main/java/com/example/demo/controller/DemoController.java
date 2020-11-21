package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.mock.Mock;
import com.example.demo.model.Defeito;
import com.example.demo.model.Peca;
import com.example.demo.model.Registro;
import com.example.demo.model.Veiculo;


@Controller
@RequestMapping("/registro")
public class DemoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping
	public ModelAndView iniciarTela() {
		ModelAndView mv = new ModelAndView("registro");
		mv.addObject("veiculos", Mock.listarVeiculos());
		
		return mv;
	}
	
	@PostMapping("/listarPecas")
	public ModelAndView listarPecas(Integer idVeiculo, String nomeCliente) {
		ModelAndView mv = new ModelAndView("registro");
		mv.addObject("veiculos", Mock.listarVeiculos());
		
		Veiculo v = Mock.buscarVeiculoPorId(idVeiculo);
		List<Registro> registros = new ArrayList<>();
		
		for(Peca p : v.getPecas()) {
			for(Defeito d : p.getDefeitos()) {
				Registro r = new Registro();
				r.setPeca(p);
				r.setDefeito(d);
				registros.add(r);
			}
		}
		
		mv.addObject("veiculo", v);
		mv.addObject("registros", registros);
		mv.addObject("idVeiculo", idVeiculo);
		mv.addObject("nomeCliente", nomeCliente);
		
		
		return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvar(Registro registro) {
		
		List<Registro> registros = new ArrayList<>();
		Date dtInclusao = new Date();
		
		for(String selecionado : registro.getSelecionados()) {
			Registro reg = new Registro();
			String[] chaves = selecionado.split("_");
			
			reg.setCliente(registro.getCliente());
			reg.setVeiculo(registro.getVeiculo());
			reg.setData(dtInclusao);
			
			Peca p = new Peca();
			p.setId(Integer.valueOf(chaves[0]));
			
			Defeito d = new Defeito();
			d.setId(Integer.valueOf(chaves[1]));
			
			reg.setPeca(p);
			reg.setDefeito(d);
			
			registros.add(reg);
		}
		
		salvarRegistros(registros);
		
		
		return iniciarTela();
	}
	
	
	private void salvarRegistros(List<Registro> registros) {
		for(Registro r : registros) {
			LOGGER.info("==================");
			LOGGER.info("SALVANDO REGISTRO");
			LOGGER.info("==================");
			LOGGER.warn("Cliente: " + r.getCliente());
			LOGGER.warn("Data: " + r.getData());
			LOGGER.warn("Veiculo: " + r.getVeiculo().getId());
			LOGGER.warn("Peca: " + r.getPeca().getId());
			LOGGER.warn("Defeito: " + r.getDefeito().getId());
			
		}
	}
}
