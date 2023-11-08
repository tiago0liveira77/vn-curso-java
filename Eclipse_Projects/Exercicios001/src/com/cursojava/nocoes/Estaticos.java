package com.cursojava.nocoes;

public class Estaticos {
	private int ID;
	
	//estatico cria variavais ou metodos partilhados
	private static int nEstaticos;
	
	
	public Estaticos() {
		this.ID = 1;
		nEstaticos++;
	}
	
	public int getID() {
		return this.ID;
	}
	
	//estatico cria variavais ou metodos partilhados
	//!!Para aceder a este metodo é chamado pelo nome da classe e nao por instancias!!
	public static int getNumEstaticos() {
		return nEstaticos;
	}
	
	public static void main(String[] args) {
		Estaticos est1 = new Estaticos();
		Estaticos est2 = new Estaticos();
		Estaticos est3 = new Estaticos();
		
		//aqui chama-se pela instancia
		System.out.println(est1.getID());
		
		//aqui e pela classe porque e um metodo static
		System.out.println("TOTAL: " + Estaticos.getNumEstaticos());
	}
}