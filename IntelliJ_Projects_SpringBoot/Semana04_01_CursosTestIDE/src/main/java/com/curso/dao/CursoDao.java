package com.curso.dao;

import com.curso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoDao extends JpaRepository<Curso, Integer> {
}
