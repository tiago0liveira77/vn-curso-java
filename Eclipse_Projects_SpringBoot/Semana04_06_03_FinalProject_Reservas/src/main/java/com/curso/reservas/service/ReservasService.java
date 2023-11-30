package com.curso.reservas.service;

import java.util.List;

import com.curso.reservas.dto.NuevaReservaDTO;
import com.curso.reservas.model.Reserva;

public interface ReservasService {
	Reserva addReserva(NuevaReservaDTO nuevaReserva);
	List<Reserva> getReservas();
	List<Reserva> getReservasByHotelName(String nombreHotel);
}
