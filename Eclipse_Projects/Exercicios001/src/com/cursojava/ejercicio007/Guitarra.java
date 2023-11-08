package com.cursojava.ejercicio007;

public class Guitarra extends Instrumento {
	private int numCordas;
	
	public Guitarra(String nombre, String tipo, int numCordas) {
		super(nombre, tipo);
		this.numCordas = numCordas;
	}
	
	public int getNumCordas() {
		return this.numCordas;
	}
}
