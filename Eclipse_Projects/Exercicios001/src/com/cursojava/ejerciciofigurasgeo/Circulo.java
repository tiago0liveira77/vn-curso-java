package com.cursojava.ejerciciofigurasgeo;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.radio * this.radio;
	}

}
