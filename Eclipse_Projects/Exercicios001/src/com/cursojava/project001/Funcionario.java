package com.cursojava.project001;


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
	 */
	@Override
	public void realizarVenda(Cliente cliente, Produto produto, int cuantidad) {
		// TODO Auto-generated method stub
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
	}

	@Override
	public void abrirLoja() {
		// TODO Auto-generated method stub
		System.out.println("Funcionario: " + this.getNome() + " abrio la loja");
	}

	@Override
	public void cerrarLoja() {
		// TODO Auto-generated method stub
		System.out.println("Funcionario: " + this.getNome() + " cerro la loja");
	}

	@Override
	public String toString() {
		return "Funcionario [funcionarioID=" + funcionarioID + ", numVendas=" + numVendas + ", Nome=" + getNome()
				+ ", Edad=" + getEdad() + ", PersonaID=" + getPersonaID() + "]";
	}
	
	
	
	
	
}
