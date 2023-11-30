package com.curso.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.vuelos.model.Vuelo;
import com.curso.vuelos.service.VuelosService;

@RestController
@RequestMapping("/vuelos")
public class VuelosController {
	@Autowired
	VuelosService service;
	
	@GetMapping
	public List<Vuelo> getVuelos(){
		return service.getVuelos();
	}
	
	@GetMapping(value="hasplazas/{idvuelo}/{plaza}")
	public Boolean hasPlazas(@PathVariable("idvuelo")int idVuelo, @PathVariable("plaza") int plaza){
		return service.hasPlazas(idVuelo, plaza);
	}
	
	@PostMapping
	public List<Vuelo> addVuelo(@RequestBody Vuelo vuelo){
		return service.addVuelo(vuelo);
	}
	
	@GetMapping(value="/disponibles/{plaza}")
	public List<Vuelo> getVuelosDisponibles(@PathVariable("plaza") int plaza){
		return service.getVuelosDisponibles(plaza);
	}
	
	@PutMapping(value="/reserve/{idvuelo}/{plazas}")
	public void udpVuelo(@PathVariable("idvuelo")int idVuelo, @PathVariable("plazas")int plazasReservadas){
		service.updVuelo(idVuelo, plazasReservadas);
	}
	
	
}
