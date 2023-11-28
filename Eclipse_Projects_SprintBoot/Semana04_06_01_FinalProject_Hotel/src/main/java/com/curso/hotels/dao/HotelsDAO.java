package com.curso.hotels.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.hotels.model.Hotel;

public interface HotelsDAO extends JpaRepository<Hotel, Integer>{
	List<Hotel> findByHotel(String hotel);
	List<Hotel> findByDisponible(Boolean disponible);
}
