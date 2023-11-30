package com.curso.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.vuelos.model.Vuelo;
import com.curso.vuelos.service.VuelosService;

/**
 * Controlador @RestController para realizar peticiones a traves de los metodos
 * Http, devolvemos y consumimos recurso en formato JSON
 *
 * @author Tiago Oliveira
 * @see com.curso.vuelos.service
 * @see com.curso.vuelos.dao
 * 
 */
@RestController
@RequestMapping("/vuelos")
public class VuelosController {
	/**
     * Inyectamos la interfaz de nuestro servicio, la conexion entre capas siempre
     * debera realizarse mediante una interfaz
     */
	@Autowired
	VuelosService service;
	
	@GetMapping
	public ResponseEntity<List<Vuelo>> getVuelos(){
		List<Vuelo> vuelos = service.getVuelos();
		if(vuelos.isEmpty()) {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.ok(vuelos);
	}
	
	
	@GetMapping(value="hasplazas/{idvuelo}/{plaza}")
	public ResponseEntity<Boolean> hasPlazas(@PathVariable("idvuelo")int idVuelo, @PathVariable("plaza") int plaza){
		return ResponseEntity.ok(service.hasPlazas(idVuelo, plaza));		
	}
	
	@PostMapping
	public ResponseEntity<Boolean> addVuelo(@RequestBody Vuelo vuelo){
		return ResponseEntity.ok(service.addVuelo(vuelo));
	}
	
	@GetMapping(value="/disponibles/{plaza}")
	public ResponseEntity<List<Vuelo>> getVuelosDisponibles(@PathVariable("plaza") int plaza){
		List<Vuelo> vuelos = service.getVuelosDisponibles(plaza);
		if(vuelos.isEmpty()) {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.ok(vuelos);
	}
	
	@PutMapping(value="/reserve/{idvuelo}/{plazas}")
	public ResponseEntity<Boolean> udpVuelo(@PathVariable("idvuelo")int idVuelo, @PathVariable("plazas")int plazasReservadas){		
		return ResponseEntity.ok(service.updVuelo(idVuelo, plazasReservadas));
	}
	
	
}
