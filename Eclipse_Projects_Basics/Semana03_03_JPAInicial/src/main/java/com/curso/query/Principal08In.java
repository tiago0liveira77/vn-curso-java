package com.curso.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.curso.model.Libro;

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
