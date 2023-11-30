package com.cursojava.ejercicio007;

public class Flauta extends Instrumento{

	private String modelo;
	
	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	@Override
	public void tocar() {
		super.tocar();
		System.out.println(" + Soplando");
	}

}
