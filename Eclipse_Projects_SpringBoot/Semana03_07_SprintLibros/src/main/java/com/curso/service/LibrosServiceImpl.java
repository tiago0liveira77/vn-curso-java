package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService{
	
	List<Libro> libros;
	
	public LibrosServiceImpl() {
		libros = new ArrayList();
		libros.add(new Libro(11111, "Java8", "programacion"));
		libros.add(new Libro(22221, "css", "web"));
		libros.add(new Libro(33331, "python", "programacion"));
		libros.add(new Libro(44441, "Windows 11", "sistemas"));
		libros.add(new Libro(55551, "Linux", "sistemas"));
	}

	@Override
	public List<Libro> libros() {
		return libros;
	}

	@Override
	public Libro buscarLibro(int isbn) {
//		for(Libro l: libros) {
//			if (l.getIsbn() == isbn)
//				return l;
//		}
//		return null;
		return libros
				.stream()
				.filter(l->l.getIsbn()==isbn)
				.findFirst()
				.orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		Libro l = buscarLibro(libro.getIsbn());
		if(l!=null) {
			l.setTitulo(libro.getTitulo());
			l.setTematica(libro.getTematica());
		}				
	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		Libro l = buscarLibro(isbn);
		if (l!=null) {
			libros.remove(l);
		}
		return libros;
	}

}
