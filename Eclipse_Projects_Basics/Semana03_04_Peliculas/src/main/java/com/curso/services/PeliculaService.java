package com.curso.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.curso.model.CodigoPrecio;
import com.curso.model.Pelicula;
import com.curso.model.TituloDiretor;

public class PeliculaService {
	/**
	 * Busca una pelicula por codigo
	 * 
	 * @param codigo
	 * @return
	 */
	public Pelicula selectPelicula(String codigo) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();
		return em.find(Pelicula.class, codigo);
	}

	/**
	 * Busca todas las peliculas
	 * 
	 * @return
	 */
	public List<Pelicula> selectPelicula() {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		TypedQuery<Pelicula> consulta = em.createQuery("SELECT p FROM Pelicula p", Pelicula.class);

		List<Pelicula> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * Inserta una nueva pelicula
	 * 
	 * @param pelicula
	 */
	public void insertPelicula(Pelicula pelicula) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas");												
		EntityManager em = emt.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(pelicula);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			System.out.println("ERROR: Duplicated PK");
		}
	}

	/**
	 * Borrar una pelicula por objeto pelicula
	 * 
	 * @param pelicula
	 */
	public void deletePelicula(Pelicula pelicula) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit																				// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		try {
	        em.getTransaction().begin();
	        Pelicula p1 = em.find(Pelicula.class, pelicula.getCodigo());
	        if (p1 != null) {
	            em.remove(p1);
	        } else {
	            System.out.println("No existe Pelicula con codigo: " + pelicula.getCodigo());
	        }
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	        System.out.println("Error a borrar película: " + e.getMessage());
	    }
	}

	/**
	 * Borra una pelicula por codigo pelicula
	 * 
	 * @param codigo
	 */
	public void deletePelicula(String codigo) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		Pelicula p1 = em.find(Pelicula.class, codigo);

		em.getTransaction().begin();
		em.remove(p1);
		em.getTransaction().commit();
	}

	/**
	 * Actualiza una pelicula
	 * 
	 * @param original
	 * @param nueva
	 */
	public void updatePelicula(Pelicula original, Pelicula nueva) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		Pelicula p1 = em.find(Pelicula.class, original.getCodigo());

		em.getTransaction().begin();

		p1.setTitulo(nueva.getTitulo());
		p1.setDireto(nueva.getDireto());
		p1.setPrecio(nueva.getPrecio());

		em.merge(p1);
		em.getTransaction().commit();

	}

	/**
	 * Busca peliculas por nombre de diretor
	 * 
	 * @param diretor
	 * @return
	 */
	public List<Pelicula> selectPeliculasByDiretor(String diretor) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		TypedQuery<Pelicula> consulta = em.createQuery("SELECT p FROM Pelicula p WHERE p.diretor = :diretor",
				Pelicula.class);
		consulta.setParameter("diretor", diretor);

		List<Pelicula> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * Busca pelicuas por nombre LIKE alguna cosa
	 * 
	 * @param like
	 * @return
	 */
	public List<Pelicula> selectPeliculasByLike(String like) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		TypedQuery<Pelicula> consulta = em.createQuery("SELECT p FROM Pelicula p WHERE p.diretor LIKE :diretor",
				Pelicula.class);
		consulta.setParameter("diretor", like + "%");

		List<Pelicula> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * Busca peliculas por lista de nombres de diretores
	 * 
	 * @param diretores
	 * @return
	 */
	public List<Pelicula> selectPeliculasByDiretoresNames(List<String> diretores) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		TypedQuery<Pelicula> consulta = em.createQuery("SELECT p FROM Pelicula p WHERE p.diretor IN :diretores",
				Pelicula.class);
		consulta.setParameter("diretores", diretores);

		List<Pelicula> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * Busca peliculas por price range
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public List<Pelicula> selectPeliculasByPrice(int min, int max) {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		TypedQuery<Pelicula> consulta = em.createQuery("SELECT p FROM Pelicula p WHERE p.precio between :min and :max",
				Pelicula.class);
		consulta.setParameter("min", min);
		consulta.setParameter("max", max);

		List<Pelicula> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * busca todos los diretores
	 * 
	 * @return
	 */
	public List<String> selectDiretores() {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		TypedQuery<String> consulta = em.createQuery("SELECT p.diretor FROM Pelicula p", String.class);

		List<String> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * Busca titulos y diretores usando un model TituloDiretor
	 * 
	 * @return
	 */
	public List<TituloDiretor> selectTituloAndDiretor() {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		String query = "SELECT NEW com.curso.model.TituloDiretor(p.titulo, p.diretor) FROM Pelicula p";
		TypedQuery<TituloDiretor> consulta = em.createQuery(query, TituloDiretor.class);

		List<TituloDiretor> lista = consulta.getResultList();

		return lista;
	}

	/**
	 * Busca codigo y precios usando un model CodigoPrecio
	 * 
	 * @return
	 */
	public List<CodigoPrecio> selectCodigoAndPrecio() {
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("peliculas"); // nombre de persistence-unit
																						// del META-INF/persistence.xml
		EntityManager em = emt.createEntityManager();

		//
		String query = "SELECT NEW com.curso.model.CodigoPrecio(p.codigo, p.precio) FROM Pelicula p";
		TypedQuery<CodigoPrecio> consulta = em.createQuery(query, CodigoPrecio.class);

		List<CodigoPrecio> lista = consulta.getResultList();

		return lista;
	}

}
