package com.cursojava.ejercicio007;

public class Orquesta {
	public static void tocarInstrumento(Instrumento instrumento) {
		if(instrumento instanceof Tambor) {
			((Tambor) instrumento).aporrear();
		} else {
			instrumento.tocar();
		}
	}
	
	public static void main(String[] args) {
		Instrumento flauta = new Flauta("Flauta", "Sopro", "Modelo 1");
		Instrumento guitarra = new Guitarra("Guitarra", "Corda", 5);
		Instrumento guitarraElec = new GuitarraEletrica("GuitarraEl", "Corda", 5);
		Instrumento tambor = new Tambor("Tambor Z34", "aporrear", 22);
		
		System.out.print("Flauta: ");
		tocarInstrumento(flauta);
		System.out.print("Guitarra: ");
		tocarInstrumento(guitarra);
		System.out.print("Guitarra Eletrica: ");
		tocarInstrumento(guitarraElec);
		System.out.print("Tambor: ");
		tocarInstrumento(tambor);
	}
}
