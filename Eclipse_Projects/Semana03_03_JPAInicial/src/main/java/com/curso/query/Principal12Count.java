package com.curso.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.curso.model.Libro;

public class Principal12Count {

	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		//
		TypedQuery<Object[]> consulta = em.createQuery("select count(l.precio), l.precio from Libro l group by l.precio", Object[].class);
	
		List<Object[]> lista = consulta.getResultList();
		
		for(Object[] sublista:lista) {
			System.out.println(sublista[0] + "---" + sublista[1]);
		}
		
		
	}

}
