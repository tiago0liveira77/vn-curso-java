package com.cursojava.ejercicio006;

public class Pagina implements Imprimible {
	int nPaginas;
	int nLineas;
	
	public Pagina(int nPagina, int nLineas) {
		super();
		this.nPaginas = nPagina;
		this.nLineas = nLineas;
	}
	
	@Override
	public void informeLargo() {
		System.out.println("NPaginas: " + this.nPaginas + "NLines " + this.nLineas);
	}
	@Override
	public void informeCorto() {
		System.out.println("NPaginas: " + this.nPaginas);
	}
}
