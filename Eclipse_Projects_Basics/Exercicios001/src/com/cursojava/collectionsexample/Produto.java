package com.cursojava.collectionsexample;

import java.util.LinkedHashSet;
import java.util.Set;

public class Produto {
	/**
	 * LinkedHashSet
	 * Guarda orden
	 * No permite duplicados
	 */
	private Set<String> numerosDeSerie = new LinkedHashSet<>();

	public void adicionarNumeroSerie(String numero) {
		numerosDeSerie.add(numero);
	}

	public boolean verificarNumeroSerie(String numero) {
		return numerosDeSerie.contains(numero);
	}
}
