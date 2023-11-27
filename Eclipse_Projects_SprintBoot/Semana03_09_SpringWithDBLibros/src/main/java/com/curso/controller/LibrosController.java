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
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibrosService;

@RestController
public class LibrosController {
	@Autowired
	LibrosService service;
	
	@GetMapping(value="libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro getLibro(@PathVariable("isbn") int isbn) {
		return service.getLibro(isbn);
	}
	
	@GetMapping(value="libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> getLibros() {
		return service.libros();
	}
	
	@PostMapping(value="libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addLibro(@RequestBody Libro libro) {
		service.addLibro(libro);
	}
	
	@PutMapping(value="libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateLibro(@RequestBody Libro libro) {
		service.updateLibro(libro);
	}
	
	@DeleteMapping(value="libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> deleteLibro(@PathVariable("isbn") int isbn) {
		return service.deleteLibro(isbn);
	}
	
	@GetMapping(value="libro/{tematica}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> findByTematica(@PathVariable("tematica") String tematica) {
		return service.findByTematica(tematica);
	}
	
}
