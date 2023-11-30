package com.cursojava.collectionsexample;

import java.util.HashMap;
import java.util.Map;

public class Usuarios {
	/**
	 * Maps
	 * Cada valor tiene una clave
	 * Las claves no pueden ser duplicadas
	 */
	private Map<Integer, String> usuarios = new HashMap<>();

	public void adicionarUsuario(int id, String nome) {
		usuarios.put(id, nome);
	}

	public String obterNomeUsuario(int id) {
		return usuarios.get(id);
	}
}
