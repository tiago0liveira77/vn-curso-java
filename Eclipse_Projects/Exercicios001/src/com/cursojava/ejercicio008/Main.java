package com.cursojava.ejercicio008;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal arr[] = new Animal[3];
		arr[0] = new Pez(true, "Pez1");
		arr[1] = new Arana(false, "Arana1");
		arr[2] = new Gato(true, "Gato1");
		
		System.out.println("----------------------");
		for (Animal an : arr) {
			an.andar();
			an.comer();
			
			if(an instanceof Gato) {
				((Gato) an).jugar();
			} else if(an instanceof Pez) {
				((Pez) an).jugar();
			} 
			System.out.println("----------------------");
		}
		
		//------------- Con arraylist 
		ArrayList<Animal> arrL = new ArrayList<Animal>();
		arrL.add(new Gato(true, "Gato1"));
	}

}
