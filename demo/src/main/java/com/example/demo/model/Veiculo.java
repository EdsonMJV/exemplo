package com.example.demo.model;

import java.util.List;

public class Veiculo {

	private Integer id;
	private String nome;
	private List<Peca> pecas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Peca> getPecas() {
		return pecas;
	}
	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}


}
