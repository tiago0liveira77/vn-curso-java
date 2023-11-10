package com.cursojava.ejerciciofigurasgeo;

public abstract class Figura {
	private int x;
	private int y;
	
	public abstract double area();
	
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static Figura figuraMaior(Figura[] arr) {
		double aux = -1;
		Figura maior = null;
		for(Figura fig: arr) {
			if (fig.area() > aux) {
				maior = fig;
				aux = fig.area();
			}
		}
		return maior;
	}
	
	
}
