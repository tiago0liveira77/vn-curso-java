package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Ejemplar;
import com.curso.service.EjemplarService;

@RestController
public class EjemplarController {
	@Autowired
	EjemplarService service;
	
	@PostMapping(value="ejemplar/{curso}/{asignaturas}/{precio}")
	public List<Ejemplar> addEjemplar(
			@PathVariable("curso") String curso, 
			@PathVariable("asignaturas")int asignaturas, 
			@PathVariable("precio")double precio){
		Ejemplar ejemplar = new Ejemplar(curso, asignaturas, precio);
		service.addEjemplar(ejemplar);
		return getEjemplares();
	}
	
	@GetMapping(value="ejemplar")
	public List<Ejemplar> getEjemplares(){
		return service.getEjemplares();
	}
}
