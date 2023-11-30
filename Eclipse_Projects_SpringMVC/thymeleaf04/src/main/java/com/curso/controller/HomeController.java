package com.curso.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.model.Vacante;
import com.curso.service.VacanteService;
@Controller
@RequestMapping("")
public class HomeController {
	@Autowired
	VacanteService service;
	
	@GetMapping("/")
	public String mostrarHome(Model model) {	
		
		String nombre = "Auxiliar de Contabilidad";		
		double salario = 2000.0;
		boolean vigente = true;		
		model.addAttribute("nombre", nombre);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);		
		return "home";
	}
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> lista = service.getVacantes();
		model.addAttribute("vacantes", lista);		
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de telecomunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setSalario(2700.0);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero  de Sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		
		return "listado";
	}




}