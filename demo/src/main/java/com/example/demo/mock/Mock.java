package com.example.demo.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.model.Defeito;
import com.example.demo.model.Peca;
import com.example.demo.model.Veiculo;

public class Mock {

	public static List<Defeito> listarDefeitos() {
		Defeito d1 = new Defeito();
		d1.setId(1);
		d1.setNome("Furo");
		
		Defeito d2 = new Defeito();
		d2.setId(2);
		d2.setNome("Ferrugem");
		
		Defeito d3 = new Defeito();
		d3.setId(3);
		d3.setNome("Gasto");
		
		Defeito d4 = new Defeito();
		d4.setId(4);
		d4.setNome("Queimado");
		
		Defeito d5 = new Defeito();
		d5.setId(5);
		d5.setNome("Quebrado");
		
		Defeito d6 = new Defeito();
		d6.setId(6);
		d6.setNome("Faltando");
		
		Defeito d7 = new Defeito();
		d7.setId(7);
		d7.setNome("Rasgado");
		
		return Arrays.asList(d1,d2,d3,d4,d5,d6,d7);
	}
	
	public static Defeito buscarDefeitoPorId(Integer idDefeito) {
		
		for(Defeito d : listarDefeitos()) {
			if(idDefeito.equals(d.getId())) {
				return d;
			}
		}
		
		return null;
	}
	
	public static List<Peca> listarPecas() {
		Peca p1 = new Peca();
		p1.setId(1);
		p1.setNome("Volante");
		p1.setDefeitos(new ArrayList<>());
		p1.getDefeitos().add(buscarDefeitoPorId(5));
		p1.getDefeitos().add(buscarDefeitoPorId(6));
		
		Peca p2 = new Peca();
		p2.setId(2);
		p2.setNome("Banco");
		p2.setDefeitos(new ArrayList<>());
		p2.getDefeitos().add(buscarDefeitoPorId(5));
		p2.getDefeitos().add(buscarDefeitoPorId(6));
		
		Peca p3 = new Peca();
		p3.setId(3);
		p3.setNome("Roda");
		p3.setDefeitos(new ArrayList<>());
		p3.getDefeitos().add(buscarDefeitoPorId(1));
		p3.getDefeitos().add(buscarDefeitoPorId(3));
		p3.getDefeitos().add(buscarDefeitoPorId(6));
		
		Peca p4 = new Peca();
		p4.setId(4);
		p4.setNome("Para-brisa");
		p4.setDefeitos(new ArrayList<>());
		p4.getDefeitos().add(buscarDefeitoPorId(5));
		
		return Arrays.asList(p1,p2,p3,p4);
	}
	
	public static Peca buscarPecaPorId(Integer idPeca) {
		
		for(Peca p : listarPecas()) {
			if(idPeca.equals(p.getId())) {
				return p;
			}
		}
		
		return null;
	}
	
	public static List<Veiculo> listarVeiculos() {
		
		Veiculo v1 = new Veiculo();
		v1.setId(1);
		v1.setNome("Carro");
		v1.setPecas(new ArrayList<>());
		v1.getPecas().add(buscarPecaPorId(1));
		v1.getPecas().add(buscarPecaPorId(2));
		v1.getPecas().add(buscarPecaPorId(3));
		v1.getPecas().add(buscarPecaPorId(4));
		
		Veiculo v2 = new Veiculo();
		v2.setId(2);
		v2.setNome("Moto");
		v2.setPecas(new ArrayList<>());
		v2.getPecas().add(buscarPecaPorId(2));
		v2.getPecas().add(buscarPecaPorId(3));

		return Arrays.asList(v1, v2);
	}
	
	public static Veiculo buscarVeiculoPorId(Integer idVeiculo) {
		
		for(Veiculo v : listarVeiculos()) {
			if(idVeiculo.equals(v.getId())) {
				return v;
			}
		}
		
		return null;
	}
	
	
}
