package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionesService;

@RestController
public class FormacionesController {
	@Autowired
	FormacionesService service;
	
	@PostMapping(value="formaciones/{curso}/{asignaturas}/{precio}")
	public List<Formacion> addFormacion(
			@PathVariable("curso") String curso, 
			@PathVariable("asignaturas")int asignaturas, 
			@PathVariable("precio")double precio){
		Formacion formacion = new Formacion(curso, asignaturas, precio);
		service.addFormacion(formacion);
		return getFormaciones();
	}
	
	@GetMapping(value="formaciones")
	public List<Formacion> getFormaciones(){
		return service.getFormaciones();
	}
}
