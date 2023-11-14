package com.cursojava.collectionsexample;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {
	/**
	 * Listas 
	 * Permitem duplicados
	 * Guarda orden por index
	 */
	private List<String> transacoes = new ArrayList<>();

	public void adicionarTransacao(String transacao) {
		transacoes.add(transacao);
	}

	public String obterTransacao(int indice) {
		return transacoes.get(indice);
	}
}
