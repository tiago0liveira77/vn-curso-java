package com.cursojava.project001;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Funcionario extends Persona implements FuncionarioActions{
	private static int nextFuncID = 1;
	private final int funcionarioID;
	private int numVendas;
	
	public Funcionario(int personaID, String nome, int edad) {
		super(personaID, nome, edad);
		this.funcionarioID = nextFuncID++;
		this.numVendas = 0;
	}

	public int getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}

	public int getFuncionarioID() {
		return funcionarioID;
	}
	
	/**
	 * Realizar una venda
	 * @param cliente
	 * @param produto
	 * @param cuantidad
	 * @throws CustomException 
	 */
	@Override
	public void realizarVenda(Cliente cliente, Produto produto, int cuantidad) throws CustomException {
		if (produto.getStock() < cuantidad) {
			throw new CustomException(2);
		} else if (cuantidad <= 0) {
			throw new CustomException(1);
		}
			
		double precioTotal = produto.getPrecio()*cuantidad;
		Venda venda = new Venda(produto, cuantidad, cliente);
		Loja.vendas.add(venda);
		System.out.print("Funcionario: " + this.getNome());
		System.out.print(" vendeu un/una : " + produto.getProductName());
		System.out.print(" a el cliente: " + cliente.getNome());
		if(precioTotal < Venda.MIN_PRECIO) {
			System.out.println(" - Cargos de Envio + 5€ ");
		} else {
			System.out.println(" - Cargos de Envio GRATIS ");
		}
		
		this.numVendas+=1;
		produto.setStock(produto.getStock()-cuantidad);
	}

	/**
	 * Abrir la loja
	 */
	@Override
	public void abrirLoja() {
		// TODO Auto-generated method stub
		System.out.println("Funcionario: " + this.getNome() + " abrio la loja");
	}

	/**
	 * Cerrar la loja
	 * Las vendas del dia son guardadas nun fichero
	 */
	@Override
	public void cerrarLoja() {
		try {
			//Crear una stream para escribit en un fichero
			FileWriter writer = new FileWriter(LocalDate.now() + "_sells.txt");
			//depues de crear el fichero -> escrebe todas las vendas registadas
			for(Venda venda: Loja.vendas) {
				writer.write(venda.toString());
				writer.write("\n");
			}
			//cerrar la stream y guardar el fichero
			writer.close();
			System.out.println("Registo de vendas del dia guardado.");
			System.out.println("Funcionario: " + this.getNome() + " cerro la loja");
		} catch (IOException e) {
			//errores abrindo la stream o fichero ...
			e.printStackTrace();
		} finally {
			System.out.println("Hasta manana");
		}
	}

	@Override
	public String toString() {
		return "Funcionario [funcionarioID=" + funcionarioID + ", numVendas=" + numVendas + ", Nome=" + getNome()
				+ ", Edad=" + getEdad() + ", PersonaID=" + getPersonaID() + "]";
	}
	
	
	
	
	
}
