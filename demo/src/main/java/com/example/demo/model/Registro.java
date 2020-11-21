package com.example.demo.model;

import java.util.Date;

public class Registro {

	private String[] selecionados;
	
	private Integer id;
	private String cliente;
	private Veiculo veiculo;
	private Peca peca;
	private Defeito defeito;
	private Date data;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	public Defeito getDefeito() {
		return defeito;
	}
	public void setDefeito(Defeito defeito) {
		this.defeito = defeito;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String[] getSelecionados() {
		return selecionados;
	}
	public void setSelecionados(String[] selecionados) {
		this.selecionados = selecionados;
	}

	
}
