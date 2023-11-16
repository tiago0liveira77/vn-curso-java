package com.curso.services;

import java.util.ArrayList;
import java.util.List;

import com.curso.models.Curso;

public class ServiceCursos {
	public List<Curso> buscarTodo(){
		Curso c1= new Curso("pilates", 1);
		Curso c2= new Curso("chino", 2);
		Curso c3= new Curso("portugues", 3);
		Curso c4= new Curso("espanhol", 4);
		List<Curso> cursos = new ArrayList();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		return cursos;
	}
}
