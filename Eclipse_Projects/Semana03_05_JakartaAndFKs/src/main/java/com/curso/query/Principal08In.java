package com.curso.query;

import java.util.List;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Principal08In {

	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		//
		TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.autor in ('Sata','Pepito')", Libro.class);
	
		List<Libro> lista = consulta.getResultList();
		
		for(Libro l:lista) {
			System.out.println(l.toString());
		}
	}

}
