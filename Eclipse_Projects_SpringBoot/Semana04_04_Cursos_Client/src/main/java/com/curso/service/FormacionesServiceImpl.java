package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dto.CursoDTO;
import com.curso.model.Formacion;

@Service
public class FormacionesServiceImpl implements FormacionesService {

	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8080/";

	@Override
	public List<Formacion> addFormacion(Formacion formacion) {
		CursoDTO curso = convertFormacionToCursoDto(formacion);
		
		template.postForLocation(url + "cursos", curso);
		return Arrays.asList(template.getForObject(url + "cursos", Formacion[].class));
	}

	@Override
	public List<Formacion> getFormaciones() {
		List<CursoDTO> cursos = Arrays.asList(template.getForObject(url + "cursos", CursoDTO[].class));
		List<Formacion> formaciones = new ArrayList<>();

		for (CursoDTO cursoDto : cursos) {
			Formacion formacion = convertCursoDtoToFormacion(cursoDto);
			formaciones.add(formacion);
		}

		return formaciones;

	}

	/**
	 * Converte duracion de cursos en numero de asignaturas de formacion
	 * @param duracion
	 * @return
	 */
	public int duracionToAsign(int duracion) {
		// usado em selects
		System.out.println("GET-Duracion: " + duracion + " |Devolve: " + (duracion > 50 ? 10 : 5));
		return duracion > 50 ? 10 : 5;
	}

	/**
	 * Converte numero de asignaturas en duracion de curso
	 * @param asignaturas 
	 * @return
	 */
	public int asignToDuracion(int asignaturas) {
		System.out.println("GET-Asignaturas: " + asignaturas + " |Devolve: " + asignaturas * 10);
		return asignaturas * 10;
	}

	/**
	 * Converte un objecto CursoDTO en Formacion
	 * @param cursoDto
	 * @return
	 */
	public Formacion convertCursoDtoToFormacion(CursoDTO cursoDto) {
		Formacion formacion = new Formacion();
		formacion.setCurso(cursoDto.getNombre());
		formacion.setAsignaturas(duracionToAsign(cursoDto.getDuracion())); // Associa duracion a asignaturas
		formacion.setPrecio(cursoDto.getPrecio());
		return formacion;
	}

	/**
	 * Converte un objecto Formacion en CursoDTO
	 * @param formacion
	 * @return
	 */
	public CursoDTO convertFormacionToCursoDto(Formacion formacion) {
		CursoDTO curso = new CursoDTO();
		curso.setNombre(formacion.getCurso());
		curso.setDuracion(asignToDuracion(formacion.getAsignaturas()));
		curso.setPrecio(formacion.getPrecio());
		return curso;
	}

}
