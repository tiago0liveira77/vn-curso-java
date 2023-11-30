package com.curso.model;

public class TituloDiretor {
	private String titulo;
	private String diretor;
	
	public TituloDiretor(String titulo, String diretor) {
		super();
		this.titulo = titulo;
		this.diretor = diretor;
	}

	
	
	@Override
	public String toString() {
		return "TituloDiretor [titulo=" + titulo + ", diretor=" + diretor + "]";
	}
	
	
}
