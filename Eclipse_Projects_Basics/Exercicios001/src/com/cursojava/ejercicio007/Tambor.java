package com.cursojava.ejercicio007;

public class Tambor extends Instrumento {
	private int tamano;

	public Tambor(String nombre, String tipo, int tamano) {
		super(nombre, tipo);
		this.tamano = tamano;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	public void aporrear() {
		System.out.println("Aporreando tambor: " + this.getNombre());
	}
}
