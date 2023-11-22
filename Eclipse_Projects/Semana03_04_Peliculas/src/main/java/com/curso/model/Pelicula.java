package com.curso.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
	@Id
	private String codigo;
	private String titulo;
	private String diretor;
	private int precio;
	
	public Pelicula() {
		super();
	}

	public Pelicula(String codigo, String titulo, String direto, int precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.diretor = direto;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDireto() {
		return diretor;
	}

	public void setDireto(String direto) {
		this.diretor = direto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, diretor, precio, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return codigo == other.codigo && Objects.equals(diretor, other.diretor) && precio == other.precio
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", direto=" + diretor + ", precio=" + precio + "]";
	}
	
	
	
}
