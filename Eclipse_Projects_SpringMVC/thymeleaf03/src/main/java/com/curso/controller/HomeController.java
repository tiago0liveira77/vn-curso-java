package com.curso.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("")
public class HomeController implements ErrorController{

	@GetMapping(value="/index")
	public  String mostrarHome() {
		return "hola";		
}
	
	@GetMapping(value="/index/producto")
	public  String mostrarProducto() {
		return "productos/producto";
	}
	@GetMapping("/saludo")
	public String mostrarHome(Model model) {
	model.addAttribute("mensaje", "Hola Mundo");
	return "home";
	}
		
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
	List<String> lista = new LinkedList<>();
	lista.add("Ingeniero de Sistemas");
	lista.add("Auxiliar de Contabilidad");
	model.addAttribute("empleos", lista);
	return "detalle";
	}

}