package com.curso.hotels.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.hotels.model.Hotel;
import com.curso.hotels.service.HotelsService;

/**
 * Controlador @RestController para realizar peticiones a traves de los metodos
 * Http, devolvemos y consumimos recurso en formato JSON
 *
 * @author Tiago Oliveira
 * @see com.curso.hotels.service
 * @see com.curso.hotels.dao
 * 
 */
@RestController
@RequestMapping("/hotels")
public class HotelsController {
	/**
     * Inyectamos la interfaz de nuestro servicio, la conexion entre capas siempre
     * debera realizarse mediante una interfaz
     */
	@Autowired
	HotelsService service;
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getHotels(){
		List<Hotel> hotels = service.getHotels();
		if(hotels.isEmpty()) {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.ok(hotels);
	}
	
	@PostMapping
	public List<Hotel> addHotel(@RequestBody Hotel hotel){
		return service.addHotel(hotel);
	}
	
	@GetMapping("/disponibles")
	public List<Hotel> getHotelsAvailable(){
		return service.getHotelsAvailable(true);
	}
	
	@GetMapping("/{hotel}")
	public Optional<Hotel> getHotelsByName(@PathVariable("hotel") String hotel){
		return service.getHotelsByName(hotel);
	}
	
	@GetMapping("/id/{hotel}")
	public int getHotelsIDByName(@PathVariable("hotel") String hotel){
		return service.getHotelsIDByName(hotel);
	}
	
	@GetMapping("/disponibles/{idhotel}")
	public Boolean isHotelAvailable(@PathVariable("idhotel") int idHotel){
		return service.isHotelAvailable(idHotel);
	}
	
}
