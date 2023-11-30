package com.cursojava.ejercicio003;

public class Produto {
	private int produtoID;
	private String modelo;
	private int quantidad;
	private double precio;
	
	public Produto () {
		super();
		this.produtoID = 1;
		this.modelo = "TestProd";
		this.quantidad = 99;
		this.precio = 34.5;
	}
	
	public Produto(int produtoID, String modelo, int quantidad, double precio) {
		super();
		this.produtoID = produtoID;
		this.modelo = modelo;
		this.quantidad = quantidad;
		this.precio = precio;
	}
	public int getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(int produtoID) {
		this.produtoID = produtoID;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuantidad() {
		return quantidad;
	}
	public void setQuantidad(int quantidad) {
		this.quantidad = quantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
