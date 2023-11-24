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

	// GET localhost:8080/libro
	@GetMapping(value = "libro", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> buscarLibros() {
		return service.libros();
	}

	// GET localhost:8080/libro/isbn
	@GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable("isbn") int isbn) {
		return service.buscarLibro(isbn);
	}

	// POST localhost:8080/libro
	@PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> addLibro(@RequestBody Libro libro) {
		service.altaLibro(libro);
		return service.libros();
	}

	// PUT localhost:8080/libro/isbn
	@PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> updateLibro(@RequestBody Libro libro) {
		service.actualizarLibro(libro);
		return service.libros();
	}

	// POST localhost:8080/libro/
	@DeleteMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> deleteLibro(@PathVariable("isbn") int isbn) {
		service.eliminarLibro(isbn);
		return service.libros();
	}

}
