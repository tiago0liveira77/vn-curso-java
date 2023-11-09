package com.cursojava.project001;

public abstract class Produto implements Feedback{
	private static int nextProductID = 1;
	private final int productID;
	private String productName;
	private double precio;
	private String feedback;
	
	public Produto(String productName, double precio) {
		super();
		this.productID = nextProductID++;
		this.productName = productName;
		this.precio = precio;
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

	public int getProductID() {
		return productID;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
