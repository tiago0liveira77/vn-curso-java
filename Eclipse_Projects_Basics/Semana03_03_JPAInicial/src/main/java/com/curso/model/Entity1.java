package com.curso.model;

public class Entity1 {
	private String autor;
	private String isbn;
		
	public Entity1() {
		super();
	}

	public Entity1(String isbn, String autor) {
		super();
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Entity1 [autor=" + autor + ", isbn=" + isbn + "]";
	}
	
	
		
	
}
