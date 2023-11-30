package com.curso.model;

public class Produto {
	private static int nextProductID = 1;
	private final int productID;
	private String productName;
	private double precio;
	private int stock;
	
	public Produto(String productName, double precio, int stock) {
		super();
		this.productID = nextProductID++;
		this.productName = productName;
		this.precio = precio;
		this.stock = stock;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getProductID() {
		return productID;
	}
	
	
}
