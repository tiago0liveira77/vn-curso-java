package com.cursojava.ejercicio008;

public class Gato extends Animal{

	
	
	public Gato(boolean esMascota, String nome) {
		super(4, esMascota, nome);
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("A los gatos les gusta comer peces y aranãs");
	}
	
	public void jugar() {
		System.out.println("A " +this.nome +" le gusta jugar con pelotas");
	}

}
