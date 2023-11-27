package com.curso.service;

import com.curso.model.Curso;

import java.util.List;

public interface CursoService {
    List<Curso> getCursos();
    Curso getCurso(int codCurso);
    void addCurso(Curso curso);
    void updateCurso(Curso curso);
    List<Curso> deleteCurso(int codCurso);
}
