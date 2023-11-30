package com.cursojava.ejercicio007;

public class GuitarraEletrica extends Guitarra{

	public GuitarraEletrica(String nombre, String tipo, int numCordas) {
		super(nombre, tipo, numCordas);
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra eletrica");
	}

}
