package com.example.demo.model;

import java.util.List;

public class Peca {

	private Integer id;
	private String nome;
	private List<Defeito> defeitos;
	
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
	public List<Defeito> getDefeitos() {
		return defeitos;
	}
	public void setDefeitos(List<Defeito> defeitos) {
		this.defeitos = defeitos;
	}
	
}
