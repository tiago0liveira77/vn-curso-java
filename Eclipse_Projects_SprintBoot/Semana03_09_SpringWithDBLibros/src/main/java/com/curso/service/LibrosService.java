package com.curso.service;

import java.util.List;

import com.curso.model.Libro;

public interface LibrosService {
	List<Libro> libros();
	Libro getLibro(int isbn);
	void addLibro(Libro libro);
	void updateLibro(Libro libro);
	List<Libro> deleteLibro(int isbn);
}
