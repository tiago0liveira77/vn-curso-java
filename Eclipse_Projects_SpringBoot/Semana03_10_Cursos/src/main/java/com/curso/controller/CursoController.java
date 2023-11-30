package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
public class CursoController {
	@Autowired
	CursoService service;

	@GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCurso() {
		return service.getCursos();
	}
	
	@GetMapping(value = "cursos/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCursoPrice(@PathVariable("min") int min, @PathVariable("max") int max) {
		return service.getCursoPrice(min, max);
	}

	@GetMapping(value = "cursos/{curso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso getCurso(@PathVariable("curso") int curso) {
		return service.getCurso(curso);
	}
	
	@PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCurso(@RequestBody Curso curso) {
		service.addCurso(curso);
	}
	
	@PutMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateCurso(@RequestBody Curso curso) {
		service.updateCurso(curso);
	}
	
	@DeleteMapping(value = "cursos/{curso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCurso(@PathVariable("curso") int curso) {
		service.deleteCurso(curso);
	}
}
