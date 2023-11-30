package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Curso;

public interface CursoDao extends JpaRepository<Curso, Integer>{
	@Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :min AND :max")
	List<Curso> getCursoPrice(@Param("min") int min, @Param("max")int max);
}
