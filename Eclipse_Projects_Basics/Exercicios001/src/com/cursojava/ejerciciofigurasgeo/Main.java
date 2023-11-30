package com.cursojava.ejerciciofigurasgeo;

public class Main {
	public static void main(String[] args) {
		Figura arr[] = new Figura[3];
		arr[0] = new Rectangulo(0, 0, 2, 3);
		arr[1] = new Cuadrado(0, 0, 55);
		arr[2] = new Circulo(0, 0, 2);
		
		Figura maior = Figura.figuraMaior(arr);
		
		System.out.println("La figura maior es el -> " +maior.toString());
	}
}
