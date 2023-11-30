package com.cursojava.collectionsexample;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	/**
	 * Set
	 * No permite duplicados
	 * No guarda orden (
	 * Solo guarda orden en linkedHashSet o Treeset
	 */
	private Set<String> alunos = new HashSet<>();

	public void matricularAluno(String aluno) {
		alunos.add(aluno);
	}

	public boolean verificarMatricula(String aluno) {
		return alunos.contains(aluno);
	}
}
