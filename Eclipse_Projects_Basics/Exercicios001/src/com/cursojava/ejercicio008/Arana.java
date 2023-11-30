package com.cursojava.ejercicio008;

public class Arana extends Animal{

	public Arana(boolean esMascota, String nome) {
		super(8, esMascota, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Las arañas comen mosquitos");
	}

	
}
