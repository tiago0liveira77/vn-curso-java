package com.cursojava.ejercicio008;

public abstract class Animal {
	int numPatas;
	boolean esMascota;
	String nome;
	
	
	public Animal(int numPatas, boolean esMascota, String nome) {
		super();
		this.numPatas = numPatas;
		this.esMascota = esMascota;
		this.setNome(nome);
	}

	public void andar() {
		System.out.println("Este animal anda sobre " + this.numPatas + " patas");
	};
	
	public void setNome(String nome) {
		if(this.esMascota) {
			this.nome = nome;
		} else {
			System.out.println("Este animal no es domestico");
		}
	}
	
	public void comer() {
		System.out.println("Estou comiendo");
	};
}
