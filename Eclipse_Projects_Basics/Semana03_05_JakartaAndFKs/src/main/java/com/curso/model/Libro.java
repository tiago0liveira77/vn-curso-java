package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	private String isbn;
	//exemplo de nome de atributo != nome de coluna: 
	//@Column(name="nome_coluna_na_db"
	private String autor;
	private int precio;
	private String titulo;
			
	public Libro() {
		super();
	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

	public Libro(String isbn, String autor, int precio, String titulo) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.precio = precio;
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, isbn, precio, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn) && precio == other.precio
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", autor=" + autor + ", precio=" + precio + ", titulo=" + titulo + "]";
	}
		
}
