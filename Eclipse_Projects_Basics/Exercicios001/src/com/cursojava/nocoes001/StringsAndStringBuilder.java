package com.cursojava.nocoes001;

public class StringsAndStringBuilder {
	
	public static void main(String[] args) {
		//as strings sao imutaveis internamente
		String nome = "Tiago";
		String apelido = "Oliveira";
	
		nome = nome + apelido; //isto funciona só visualmene
		
		StringBuilder strb1 = new StringBuilder();
		strb1.append("Ola");
		strb1.append(" Mundo!!");
		System.out.println(strb1);
		
		//adicionar em elemento i
		strb1.insert(2, "á");
		System.out.println(strb1);
		
		//pagar intervalo
		strb1.delete(10, 11);
		System.out.println(strb1);
		
		//criar substring
		String subtext = strb1.substring(2);
		String subtext2 = strb1.substring(2,5);
		
		System.out.println(subtext);
		System.out.println(subtext2);
	}
}
