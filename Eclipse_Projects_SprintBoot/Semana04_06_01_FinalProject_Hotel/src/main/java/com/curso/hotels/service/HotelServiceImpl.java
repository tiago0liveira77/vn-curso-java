package com.curso.hotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.hotels.dao.HotelsDAO;
import com.curso.hotels.model.Hotel;

@Service
public class HotelServiceImpl implements HotelsService {
	@Autowired
	HotelsDAO dao;

	@Override
	public List<Hotel> getHotels() {
		return dao.findAll();
	}
	
	@Override
	public List<Hotel> getHotelsAvailable(boolean disponible) {
		return dao.findByDisponible(disponible);
	}

	@Override
	public List<Hotel> getHotelsByName(String hotel) {
		return dao.findByHotel(hotel);
	}

}
