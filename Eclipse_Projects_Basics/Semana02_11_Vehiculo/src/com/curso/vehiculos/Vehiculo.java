package com.curso.vehiculos;

public abstract class Vehiculo implements Conducible{
	private String matricula;
	private String color;
	
	public Vehiculo(String matricula, String color) {
		super();
		this.matricula = matricula;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public void pintar(String color) {
		this.color = color;
	}
	
		
}
