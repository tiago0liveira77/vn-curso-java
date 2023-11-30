package com.cursojava.project001;

public class Ordenador extends Produto{
	private String brand;
	private String cpu;
	
	public Ordenador(String productName, double precio, int stock, String brand, String cpu) {
		super(productName, precio, stock);
		this.brand = brand;
		this.cpu = cpu;
	}

	@Override
	public void avaliar(String feedback) {
		this.setFeedback(feedback);;
	}

	@Override
	public String toString() {
		return "Ordenador [brand=" + brand + ", cpu=" + cpu + ", ProductName="
				+ getProductName() + ", Precio=" + getPrecio() + ", Stock=" + getStock() + ", ProductID=" + getProductID()
				+ ", Feedback=" + getFeedback() + "]";
	}
	
	
	
}
