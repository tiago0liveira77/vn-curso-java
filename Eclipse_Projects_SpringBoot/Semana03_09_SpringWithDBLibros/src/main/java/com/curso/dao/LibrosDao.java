package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Libro;

public interface LibrosDao extends JpaRepository<Libro, Integer> {
	@Query("SELECT l FROM Libro l WHERE l.tematica like :tematica")
	List<Libro> findByTematica(@Param("tematica") String tematica);
}
