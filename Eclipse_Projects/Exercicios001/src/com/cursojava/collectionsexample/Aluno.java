package com.cursojava.collectionsexample;

import java.util.Set;
import java.util.TreeSet;

public class Aluno {
	/**
	 * TreeSet
	 * Armazena en ordem ascendente natural
	 * No permite duplicados
	 */
	private Set<String> alunos = new TreeSet<>();

	public void adicionarAluno(String aluno) {
		alunos.add(aluno);
	}

	public Set<String> obterAlunosOrdenados() {
		return alunos;
	}
}
