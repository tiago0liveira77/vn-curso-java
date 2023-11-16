package com.curso.models;

import java.util.List;

public class Persona {
	private String nome;
	private List<String> cursos;
	
	public Persona(String nome, List<String> cursos) {
		super();
		this.nome = nome;
		this.cursos = cursos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}
	
	
	
}
