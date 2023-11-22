package com.curso.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.curso.model.Entity1;
import com.curso.model.Libro;

public class Principal13DosCampos {

	public static void main(String[] args) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("biblio"); //nombre de persistence-unit del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		
		//
		TypedQuery<Object[]> consulta = em.createQuery("select l.autor, l.isbn from Libro l", Object[].class);
	
		List<Object[]> lista = consulta.getResultList();
		
		for(Object[] sublista:lista) {
			System.out.println(sublista[0] + "---" + sublista[1]);
		}
		
		//Usando model
		System.out.println("--------USANDO MODEL---------");
		String query = "SELECT NEW com.curso.model.Entity1(l.isbn, l.autor) FROM Libro l";
		TypedQuery<Entity1> consulta2 = em.createQuery(query, Entity1.class);

		List<Entity1> lista2 = consulta2.getResultList();

		for (Entity1 ent : lista2) {
		    System.out.println(ent.toString());
		}

	}

}
