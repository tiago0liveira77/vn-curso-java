package com.curso.query;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Principal10Funciones {

	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		//
		TypedQuery<String> consulta = em.createQuery("select distinct upper(l.autor) from Libro l", String.class);
	
		List<String> lista = consulta.getResultList();
		
		for(String l:lista) {
			System.out.println(l.toString());
		}
	}

}
