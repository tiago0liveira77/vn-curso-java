package com.cursojava.ejerciciofigurasgeo;

public class Rectangulo extends Figura{
	private int comp;
	private int larg;
	
	public Rectangulo(int x, int y, int comp, int larg) {
		super(x, y);
		this.comp = comp;
		this.larg = larg;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.comp*this.larg;
	}

	@Override
	public String toString() {
		return "Rectangulo [x=" + this.getX() +", y=" + this.getY() + ", comp=" + comp + ", larg=" + larg + "]";
	}

	
	
}
