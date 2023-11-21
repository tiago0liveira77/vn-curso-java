package com.curso.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.model.Libro;

public class Principal02Insertar {

	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		Libro l1 = new Libro("2A", "Sata", 49, "Estamos a marte");
		
		em.getTransaction().begin();
		em.persist(l1);
		em.getTransaction().commit();
	}

}
