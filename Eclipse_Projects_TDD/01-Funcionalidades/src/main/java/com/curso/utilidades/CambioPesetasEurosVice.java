package com.curso.utilidades;

public class CambioPesetasEurosVice {
	public static double pesetasToEuro(double pesetas) {
		return (pesetas / 166.386);
	}

	public static double EuroToPesetas(double euros) {
		return (euros * 166.386);
	}

	public static void main(String[] args) {
		System.out.println(pesetasToEuro(1.00));
		System.out.println(EuroToPesetas(1.00));
	}
}
