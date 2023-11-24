package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibrosDao;
import com.curso.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService{
	@Autowired
	LibrosDao dao;

	@Override
	public List<Libro> libros() {
		return dao.findAll();
	}

	@Override
	public Libro getLibro(int isbn) {
		return dao.findById(isbn).orElse(null);
	}

	@Override
	public void addLibro(Libro libro) {
		dao.save(libro);
		
	}

	@Override
	public void updateLibro(Libro libro) {
		dao.save(libro);
	}

	@Override
	public List<Libro> deleteLibro(int isbn) {
		dao.deleteById(isbn);
		return libros();
	}

}
