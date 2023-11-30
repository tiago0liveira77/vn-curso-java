package com.cursojava.ejercicio005;

public class Cuenta {
	private String titular;
	private float cantidad;
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
		this.cantidad = 0;
	}
	
	public Cuenta(String titular, float cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingressar(float value) {
		if (value > 0)
		this.cantidad += value;
	}
	
	public void retirar(float value) {
		if (this.cantidad > value)
			this.cantidad -= value;
		else 
			this.cantidad = 0;
	
	}
}
