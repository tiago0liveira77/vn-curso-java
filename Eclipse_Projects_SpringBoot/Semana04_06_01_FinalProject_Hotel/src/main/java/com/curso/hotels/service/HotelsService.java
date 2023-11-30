package com.curso.hotels.service;

import java.util.List;
import java.util.Optional;

import com.curso.hotels.model.Hotel;

public interface HotelsService {
	List<Hotel> getHotels();
	List<Hotel> getHotelsAvailable(boolean disponible);
	Optional<Hotel> getHotelsByName(String nombre);
	int getHotelsIDByName(String nombre);
	Boolean addHotel(Hotel hotel);
	Boolean isHotelAvailable(int idHotel);
	
}
