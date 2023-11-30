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

@RestController
@RequestMapping("/reservas")
public class ReservasController {
	@Autowired
	ReservasService service;
	
	/**
	 * Add Nueva reserva verificando
	 * Si Hay plazas suficientes
	 * SI el hotel esta disponible
	 * 
	 * GET /reservas
	 * 
	 * @param nuevaReserva
	 * @return ResponseEntity<?> con el status y la reserva en caso success
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
	 * Retorna una lista de todas las reservas
	 * @return 
	 */
	@GetMapping
	public List<Reserva> getReservas(){
		return service.getReservas();
	}
	
	/**
	 * Retorna una lista de reservas de con un determinado hotel
	 * @param nombreHotel
	 * @return
	 */
	@GetMapping(value="{hotel}")
	public List<Reserva> getReservasByHotelName(@PathVariable("hotel")String nombreHotel){
		return service.getReservasByHotelName(nombreHotel);
	}
	
}
