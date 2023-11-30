package com.curso.model;

public class Info {
	private String nombre;
	private String email;
	private int edad;
	
	public Info() {
		super();
	}

	public Info(String nombre, String email, int edad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Info [nombre=" + nombre + ", email=" + email + ", edad=" + edad + "]";
	}
	
	
}
