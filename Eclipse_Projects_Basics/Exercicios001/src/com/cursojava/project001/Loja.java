package com.cursojava.project001;

import java.util.ArrayList;

public class Loja {
	static ArrayList<Venda> vendas= new ArrayList<Venda>();
	
	public static void listarVendas() {
		for(Venda vendax : vendas) {
			System.out.println(vendax.toString());
		}
	}
		
	public static void main(String[] args) throws CustomException {
		Persona cliente1 = new Cliente(1111, "Cliente1", 21);
		Persona cliente2 = new Cliente(1112, "Cliente2", 23);
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		
		Persona funcionario1 = new Funcionario(2222, "Func1", 22);
		Persona funcionario2 = new Funcionario(2223, "Func2", 26);
		System.out.println(funcionario1.toString());
		System.out.println(funcionario2.toString());
		
		Produto produto1 = new Ordenador("Ordenador1", 44, 4, "HP", "Intel i5" );
		Produto produto2 = new Ordenador("Ordenador2", 66, 5, "HP", "Intel i7" );
		System.out.println(produto1.toString());
		System.out.println(produto2.toString());
		
		System.out.println("\n\n----||||||LOJA||||||----");
		
		((Funcionario) funcionario1).abrirLoja();
		((Funcionario) funcionario1).realizarVenda((Cliente)cliente1, produto1, 1);
		((Funcionario) funcionario1).realizarVenda((Cliente)cliente2, produto2, 1);
		
		listarVendas();
		
		((Funcionario) funcionario1).cerrarLoja();
	}
}
