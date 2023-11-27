package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dto.CursoDTO;
import com.curso.model.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplarService {

	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8080/";

	@Override
	public List<Ejemplar> addEjemplar(Ejemplar ejemplar) {
		CursoDTO curso = convertEjemplarToCursoDto(ejemplar);
		
		template.postForLocation(url + "cursos", curso);
		return Arrays.asList(template.getForObject(url + "cursos", Ejemplar[].class));
	}

	@Override
	public List<Ejemplar> getEjemplares() {
		List<CursoDTO> cursos = Arrays.asList(template.getForObject(url + "cursos", CursoDTO[].class));
		List<Ejemplar> ejemplares = new ArrayList<>();

		for (CursoDTO cursoDto : cursos) {
			Ejemplar ejemplar = convertCursoDtoToEjemplar(cursoDto);
			ejemplares.add(ejemplar);
		}

		return ejemplares;

	}

	@Override
	public int duracionToAsign(int duracion) {
		// usado em selects
		System.out.println("GET-Duracion: " + duracion + " |Devolve: 10 ou 5");
		return duracion > 50 ? 10 : 5;
	}

	@Override
	public int asignToDuracion(int asignaturas) {
		System.out.println("GET-Asignaturas: " + asignaturas + " |Devolve: " + asignaturas * 10);
		return asignaturas * 10;
	}

	@Override
	public Ejemplar convertCursoDtoToEjemplar(CursoDTO cursoDto) {
		Ejemplar ejemplar = new Ejemplar();
		ejemplar.setCurso(cursoDto.getNombre());
		ejemplar.setAsignaturas(duracionToAsign(cursoDto.getDuracion())); // Associa duracion a asignaturas
		ejemplar.setPrecio(cursoDto.getPrecio());
		return ejemplar;
	}

	@Override
	public CursoDTO convertEjemplarToCursoDto(Ejemplar ejemplar) {
		CursoDTO curso = new CursoDTO();
		curso.setNombre(ejemplar.getCurso());
		curso.setDuracion(asignToDuracion(ejemplar.getAsignaturas()));
		curso.setPrecio(ejemplar.getPrecio());
		return curso;
	}

}
