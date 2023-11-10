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
	
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [x=" + this.getX() +", y=" + this.getY() + ", comp=" + this.getRadio()+ "]";
	}

}
