package com.cursojava.ejercicio003;

public class Telefono extends Produto{
	private String operador;

	
	public Telefono() {
		super();
		this.operador = "operadortest";
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public static void main(String[] args) {
		Telefono tel1 = new Telefono();
		System.out.println(tel1.getPrecio());
	}
}
