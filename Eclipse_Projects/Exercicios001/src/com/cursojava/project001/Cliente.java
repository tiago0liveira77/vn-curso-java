package com.cursojava.project001;

public class Cliente extends Persona{
	private static int nextCliID = 1;
	private final int clientID;
	private int numCompras;
	
	public Cliente(int personaID, String nome, int edad) {
		super(personaID, nome, edad);
		this.clientID = nextCliID++;
		this.numCompras = 0;
	}

	public int getNumCompras() {
		return numCompras;
	}

	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}

	public int getClientID() {
		return clientID;
	}

	@Override
	public String toString() {
		return "Cliente [clientID=" + clientID + ", numCompras=" + numCompras + ", Nome=" + getNome()
				+ ", Edad=" + getEdad() + ", PersonaID=" + getPersonaID()+"]";
	}
	
	
	
	
	
}
