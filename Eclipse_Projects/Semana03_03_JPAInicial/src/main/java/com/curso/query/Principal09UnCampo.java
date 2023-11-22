package com.curso.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.curso.model.Libro;

public class Principal09UnCampo {

	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		//
		TypedQuery<String> consulta = em.createQuery("SELECT l.autor FROM Libro l", String.class);
	
		List<String> lista = consulta.getResultList();
		
		for(String l:lista) {
			System.out.println(l.toString());
		}
	}

}
