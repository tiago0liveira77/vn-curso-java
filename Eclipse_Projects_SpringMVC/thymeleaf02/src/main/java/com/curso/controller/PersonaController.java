package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.PersonaService;
@Controller
@RequestMapping("/personas")
public class PersonaController {
	@Autowired
	PersonaService miservicio;
	
	//@RequestMapping("/lista")
	public String mostrarPersonas2(Model modelo) {		
		return "personas/lista";
	}
	
	@RequestMapping("/lista2")
	public String mostrarPersonas(Model modelo) {		
		modelo.addAttribute("lista",miservicio.buscarTodos());
		return "personas/lista2";
	}
	//ESTO NO FUNCIONA
	/*
	@RequestMapping("/usuarios/{id}")
	public String obtenerUsuarios(@PathVariable("id") int id){
	    return "usuario con el id " + id;
	}
	*/

}
