package com.cursojava.collectionsexample;

import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
	/**
	 * Queue
	 * Guarda la orden
	 * 
	 */
	private Queue<String> fila = new LinkedList<>();

	public void adicionarCliente(String cliente) {
		fila.add(cliente);
	}

	public String atenderCliente() {
		return fila.poll();
	}
}
