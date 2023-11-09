package com.cursojava.ejercicio008;

public class Pez extends Animal{

	public Pez(boolean esMascota, String nome) {
		super(0, esMascota, nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void andar() {
		// TODO Auto-generated method stub
		super.andar();
		System.out.println("En realidad no ando, nado");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Los peces comen plancton");
	}
	
	public void jugar() {
		System.out.println("Estoy nadando");
	}

}
