package com.curso.reservas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.reservas.model.Reserva;

public interface ReservasDAO extends JpaRepository<Reserva, Integer>{
	List<Reserva> findByIdHotel(int idHotel);
}
