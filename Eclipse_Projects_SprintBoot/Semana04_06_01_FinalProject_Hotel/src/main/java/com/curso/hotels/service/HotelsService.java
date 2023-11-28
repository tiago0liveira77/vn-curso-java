package com.curso.hotels.service;

import java.util.List;

import com.curso.hotels.model.Hotel;

public interface HotelsService {
	List<Hotel> getHotels();
	List<Hotel> getHotelsAvailable(boolean disponible);
	List<Hotel> getHotelsByName(String nombre);
	
}
