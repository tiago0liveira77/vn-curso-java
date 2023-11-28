package com.curso.hotels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.hotels.model.Hotel;
import com.curso.hotels.service.HotelsService;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
	@Autowired
	HotelsService service;
	
	@GetMapping
	public List<Hotel> getHotels(){
		return service.getHotels();
	}
	
	@GetMapping("/disponibles")
	public List<Hotel> getHotelsAvailable(){
		return service.getHotelsAvailable(true);
	}
	
	@GetMapping("/{hotel}")
	public List<Hotel> getHotelsByName(@PathVariable("hotel") String hotel){
		return service.getHotelsByName(hotel);
	}
	
	
	
}
