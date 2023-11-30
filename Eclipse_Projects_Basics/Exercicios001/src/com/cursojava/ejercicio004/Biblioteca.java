package com.cursojava.ejercicio004;

public class Biblioteca {
	public static void main(String[] args) {
		Libro libro1 = new Libro("0123456789123", "Titulo1", "Autor1", 143);
		Libro libro2 = new Libro("1123456789123", "Titulo2", "Autor2", 144);
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		if(libro1.getnPages() > libro2.getnPages()) {
			System.out.println("Libro 1 tiene mas paginas: " + libro1.getnPages());
		} else if (libro1.getnPages() < libro2.getnPages()){
			System.out.println("Libro 2 tiene mas paginas: " + libro2.getnPages());	
		} else 
		{
			System.out.println("Ambos tienen: " + libro2.getnPages());
		}
		
	}
}
