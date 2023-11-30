package com.curso.reservas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.reservas.dto.NuevaReservaDTO;
import com.curso.reservas.model.Reserva;
import com.curso.reservas.service.ReservasService;

/**
 * Controlador @RestController para realizar peticiones a traves de los metodos
 * Http, devolvemos y consumimos recurso en formato JSON
 * 
 * @author Tiago Oliveira
 * @see com.curso.reservas.service.ReservasService
 * @see com.curso.reservas.dao.ReservasDAO
 * 
 * 
 */
@RestController
@RequestMapping("/reservas")
public class ReservasController {
	/**
     * Inyectamos la interfaz de nuestro servicio, la conexion entre capas siempre
     * debera realizarse mediante una interfaz
     */
	@Autowired
	ReservasService service;
	
	/**
	 * 
	 * Add Nueva reserva verificando
	 * Si Hay plazas suficientes
	 * SI el hotel esta disponible
	 * 
	 * GET /reservas
	 * 
	 * @param NuevaReservaDTO nuevaReserva
	 * @return ResponseEntity<?>
	 */
	@PostMapping
	public ResponseEntity<?> addReserva(@RequestBody NuevaReservaDTO nuevaReserva) {
	    Reserva reserva = service.addReserva(nuevaReserva);

	    if (reserva != null) {
	        return ResponseEntity.ok(reserva);
	    } else {
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro creando una nueva reserva...");
	    }
	}
	
	/**
	 * Obtener Reservas
	 * @return ResponseEntity<List<Reserva>>
	 */
	@GetMapping
	public ResponseEntity<List<Reserva>> getReservas(){
		List<Reserva> reservas = service.getReservas();
		if(reservas.isEmpty()) {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.ok(reservas);
	}
	
	/**
	 * Obtener Reservas de un HOTEL
	 * @param nombreHotel
	 * @return ResponseEntity<List<Reserva>>
	 */
	@GetMapping(value="{hotel}")
	public ResponseEntity<List<Reserva>> getReservasByHotelName(@PathVariable("hotel")String nombreHotel){
		List<Reserva> reservas = service.getReservasByHotelName(nombreHotel);
		if(reservas.isEmpty()) {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.ok(reservas);
	}
	
}
