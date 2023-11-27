package com.curso.service;

import java.util.List;

import com.curso.dto.CursoDTO;
import com.curso.model.Ejemplar;

public interface EjemplarService {
	List<Ejemplar> addEjemplar(Ejemplar ejemplar);
	List<Ejemplar> getEjemplares();
	
	Ejemplar convertCursoDtoToEjemplar(CursoDTO cursoDto);
	CursoDTO convertEjemplarToCursoDto(Ejemplar cursoDto);
	int duracionToAsign(int duracion);
	int asignToDuracion(int asignaturas);
}
