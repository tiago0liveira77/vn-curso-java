package com.curso.model;

public class CodigoPrecio {
	private String codigo;
	private int precio;
	
	public CodigoPrecio(String codigo, int precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CodigoPrecio [codigo=" + codigo + ", precio=" + precio + "]";
	}
	
	
	
}
