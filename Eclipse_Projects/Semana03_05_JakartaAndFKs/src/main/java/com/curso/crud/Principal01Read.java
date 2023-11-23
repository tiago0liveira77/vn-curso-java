package com.curso.crud;


import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal01Read {
	
	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		Libro libro = em.find(Libro.class, "2A");
		System.out.println(libro.getIsbn());
		System.out.println(libro.getAutor());
		System.out.println(libro.getTitulo());
	}	
	
}
