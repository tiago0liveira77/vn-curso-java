package com.cursojava.ejercicio004;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;

	public Libro(String isbn, String titulo, String autor, int nPages) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = nPages;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPages() {
		return numPaginas;
	}

	public void setnPages(int nPages) {
		this.numPaginas = nPages;
	}

	@Override
	public String toString() {
		return "El Libro con ISBN=" + isbn + " creado por el autor " + autor + " tiene " + numPaginas + " páginas";
	}

}
