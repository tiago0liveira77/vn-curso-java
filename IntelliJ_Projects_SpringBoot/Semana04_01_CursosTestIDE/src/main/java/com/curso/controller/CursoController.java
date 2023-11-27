package com.curso.controller;

import com.curso.model.Curso;
import com.curso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {
    @Autowired
    CursoService service;

    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCurso() {
        return service.getCursos();
    }

    @GetMapping(value = "cursos/{curso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getCurso(@PathVariable("curso") int curso) {
        return service.getCurso(curso);
    }

    @PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCurso(@RequestBody Curso curso) {
        service.addCurso(curso);
    }

    @PutMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCurso(@RequestBody Curso curso) {
        service.updateCurso(curso);
    }

    @DeleteMapping(value = "cursos/{curso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCurso(@PathVariable("curso") int curso) {
        service.deleteCurso(curso);
    }
}
