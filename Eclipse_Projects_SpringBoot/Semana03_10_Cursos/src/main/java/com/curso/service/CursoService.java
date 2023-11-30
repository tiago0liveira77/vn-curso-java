package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {
    List<Curso> getCursos();
    Curso getCurso(int codCurso);
    void addCurso(Curso curso);
    void updateCurso(Curso curso);
    List<Curso> deleteCurso(int codCurso);
    List<Curso> getCursoPrice(int min, int max);
}
