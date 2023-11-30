package com.cursojava.project001;

public interface FuncionarioActions {
	public void abrirLoja();
	public void cerrarLoja();
	public void realizarVenda(Cliente cliente, Produto produto, int cuantidad) throws CustomException;
}
