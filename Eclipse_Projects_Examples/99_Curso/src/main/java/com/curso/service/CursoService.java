package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {

	List<Curso> save(Curso curso);

	List<Curso> deleteById(int codCurso);

	List<Curso> getAll();

	Curso getById(int codCurso);
	
	void update(int codCurso, int duracion);

	List<Curso> findByPrecioBetween(int minPrecio, int maxPrecio);

}
