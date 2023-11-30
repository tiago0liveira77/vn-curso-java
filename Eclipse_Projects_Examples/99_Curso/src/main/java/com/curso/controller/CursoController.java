package com.curso.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

/**
	 * Controlador @RestController para realizar peticiones a traves de los metodos
	 * Http, devolvemos y consumimos recurso en formato JSON
	 *
	 * @author 
	 * @see com.curso.CursoServiceImpl
	 * @see com.curso.service.CursoService
	 * @see com.cursp.dao.CursoDao
	 * @since version 1.0
	 */
	@RestController
	public class CursoController {

	    /**
	     * Inyectamos la interfaz de nuestro servicio, la conexion entre capas siempre
	     * debera realizarse mediante una interfaz
	     */
	    @Autowired
	    private CursoService service;

	    /**
	     * @return List<Curso>
	     */
	    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Curso>> getAll() {
	        List<Curso> cursos = service.getAll();

	        if (cursos.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	        }
	        return ResponseEntity.ok(cursos);
	    }

	    /**
	     * @param 
	     * @return 
	     */
	    @GetMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> getById(@PathVariable("codCurso") int codCurso) {
	        try {
	            Curso curso = service.getById(codCurso);
	            return ResponseEntity.ok(curso);

	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Collections.singleton(new Curso("Curso no valido", 0, 0)));

	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	    }

	    /**
	     * @param curso
	     * @return List<Curso>
	     */
	    @PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public List<Curso> save(@RequestBody Curso curso) {
	        return service.save(curso);
	    }

	    /**
	     * @param codCurso
	     * @param duracion
	     */
	    
	       public ResponseEntity<?> update(@PathVariable("codCurso") int codCurso, @PathVariable("duration") int duracion) {
	        try {
	            if (codCurso < 0 || duracion <= 0) {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El id del curso y la duracion deben ser mayores que 0");
	            }

	            service.update(codCurso, duracion);
	            return ResponseEntity.ok("Curso actualizado con exito");

	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	    }
	    
	    /**
	     * @param codCurso
	     * @return List<Curso>
	     */
	    @DeleteMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> deleteById(@PathVariable("codCurso") int codCurso) {
	        try {
	            if (codCurso < 0) {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ese valor no es valido");
	            }

	            List<Curso> cursos = service.deleteById(codCurso);
	            return ResponseEntity.ok(cursos);

	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	    }

	    /**
	     * @param minPrecio
	     * @param maxPrecio
	     * @return List<Curso>
	     */
	    @GetMapping(value = "cursos/{minimo}/{maximo}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Curso>> findByPrecioBetween(@PathVariable("minimo") int minPrecio, @PathVariable("maximo") int maxPrecio) {
	        try {
	            if (minPrecio < 0 || maxPrecio < 0 || minPrecio > maxPrecio) {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	            }

	            List<Curso> cursos = service.findByPrecioBetween(minPrecio, maxPrecio);
	            return ResponseEntity.ok(cursos);

	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	    }

	}
