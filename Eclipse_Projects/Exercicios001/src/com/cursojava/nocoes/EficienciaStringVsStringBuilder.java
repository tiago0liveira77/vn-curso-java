package com.cursojava.nocoes;

import java.text.DecimalFormat;

public class EficienciaStringVsStringBuilder {
	public static void main(String[] args) {
		int iteracion = 999;
		long startTime;
		long endTime;
		double stringTime;
		String strConcatenado = "";
		
		// Usando String
		startTime = System.nanoTime();
		for (int i = 0; i <= iteracion; i++) {
			strConcatenado += "Hola";
		}

		endTime = System.nanoTime();

		stringTime = endTime - startTime;

		System.out.print("Usando String: ");

		System.out.println(stringTime);

		// Usando StringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		startTime = System.nanoTime();
		for (int i = 0; i <= iteracion; i++) {
			stringBuilder.append("Hola");
		}

		endTime = System.nanoTime();
		stringTime = endTime - startTime;
		System.out.print("Usando StringBuilder: ");
		System.out.println(stringTime);

		
		/*******************************************/

		
		strConcatenado = "";
		startTime = System.nanoTime();
		
		for (int i = 0; i < iteracion; i++) {
			strConcatenado += "Hola";
		}

		endTime = System.nanoTime();
		stringTime = (endTime - startTime) / 1_000_000.0; // pasamos a milisegundos
		DecimalFormat decimalFormatString = new DecimalFormat("#,###.###");
		String stringTimeFormatted = decimalFormatString.format(stringTime);
		System.out.println("Tiempo usando String: " + stringTimeFormatted + " milisegundos");

		
		// Usando StringBuilder para concatenar
		stringBuilder = new StringBuilder();
		startTime = System.nanoTime();
		
		for (int i = 0; i < iteracion; i++) {
			stringBuilder.append("Hola");
		}

		endTime = System.nanoTime();
		double stringBuilderTime = (endTime - startTime) / 1_000_000.0; // pasamos a milisegundos
		DecimalFormat decimalFormatStringBuilder = new DecimalFormat("#,###.###");
		String stringBuilderTimeFormatted = decimalFormatStringBuilder.format(stringBuilderTime);
		System.out.println("Tiempo usando StringBuilder: " + stringBuilderTimeFormatted + " milisegundos");

	}
}