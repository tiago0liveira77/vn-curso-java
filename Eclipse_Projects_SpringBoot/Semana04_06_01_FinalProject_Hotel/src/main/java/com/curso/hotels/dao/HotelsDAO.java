package com.curso.hotels.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.hotels.model.Hotel;

public interface HotelsDAO extends JpaRepository<Hotel, Integer>{
	Optional<Hotel> findByHotel(String hotel);
	List<Hotel> findByDisponible(Boolean disponible);
}
