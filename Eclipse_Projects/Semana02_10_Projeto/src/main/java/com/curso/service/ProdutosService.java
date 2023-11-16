package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import com.curso.model.Produto;

public class ProdutosService {

	public static List<Produto> produtos = new ArrayList();
	

	public List<Produto> getProdutos() {
		if (produtos.isEmpty()) {
			iniciarProdutos();
		}
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void addProduto(Produto p) {
		this.produtos.add(p);
	}
	
	public void delProduto(Produto p) {
		this.produtos.remove(p);
	}



	public void iniciarProdutos(){
		produtos.add(new Produto("Produto 1", 50, 230));
		produtos.add(new Produto("Produto 2", 30, 550));
		produtos.add(new Produto("Produto 3", 20, 887));
		produtos.add(new Produto("Produto 4", 660, 790));
	}
}
