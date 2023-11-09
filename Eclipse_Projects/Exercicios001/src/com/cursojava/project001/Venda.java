package com.cursojava.project001;

public class Venda {
	private static int nextVendaID = 1;
	private final int vendaID;
	private Produto produto;
	private int cuantidad;
	private Cliente cliente;
	
	public Venda(Produto produto, int cuantidad, Cliente cliente) {
		super();
		this.vendaID = nextVendaID++;
		this.produto = produto;
		this.cuantidad = cuantidad;
		this.cliente = cliente;
	}
	
	public int getVendaID() {
		return vendaID;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getCuantidad() {
		return cuantidad;
	}
	public void setCuantidad(int cuantidad) {
		this.cuantidad = cuantidad;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venda [vendaID=" + vendaID + ", produto=" + produto + ", cuantidad=" + cuantidad + ", cliente="
				+ cliente + "]";
	}
	
	
	
}
