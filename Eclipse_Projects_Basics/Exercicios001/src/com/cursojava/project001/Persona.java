package com.cursojava.project001;

public abstract class Persona {
	private final int personaID;
	private String nome;
	private int edad;
	
	public Persona(int personaID, String nome, int edad) {
		super();
		this.personaID = personaID;
		this.nome = nome;
		this.edad = edad;
	}

	public String getNome() {
		return nome;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPersonaID() {
		return personaID;
	}
	
	
	
	
}
