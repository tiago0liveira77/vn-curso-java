package com.cursojava.project001;

public class Ordenador extends Produto{
	private final int serialNumber;
	private String brand;
	private String cpu;
	
	public Ordenador(String productName, double precio, int serialNumber, String brand, String cpu) {
		super(productName, precio);
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.cpu = cpu;
	}

	@Override
	public void avaliar(String feedback) {
		this.setFeedback(feedback);;
	}

	@Override
	public String toString() {
		return "Ordenador [serialNumber=" + serialNumber + ", brand=" + brand + ", cpu=" + cpu + ", ProductName="
				+ getProductName() + ", Precio=" + getPrecio() + ", ProductID=" + getProductID()
				+ ", Feedback=" + getFeedback() + "]";
	}
	
	
	
}
