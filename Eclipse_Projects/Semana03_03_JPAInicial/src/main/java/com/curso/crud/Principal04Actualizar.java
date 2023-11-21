package com.curso.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.model.Libro;

public class Principal04Actualizar {
	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		Libro l1 = em.find(Libro.class, "2A");
		
		em.getTransaction().begin();
		em.remove(l1);
		em.getTransaction().commit();
	}
}
