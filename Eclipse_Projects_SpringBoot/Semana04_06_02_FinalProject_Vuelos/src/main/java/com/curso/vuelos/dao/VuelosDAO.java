package com.curso.vuelos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.vuelos.model.Vuelo;

public interface VuelosDAO extends JpaRepository<Vuelo, Integer>{
	List<Vuelo> findByPlazaGreaterThanEqual(int plazas);
}
