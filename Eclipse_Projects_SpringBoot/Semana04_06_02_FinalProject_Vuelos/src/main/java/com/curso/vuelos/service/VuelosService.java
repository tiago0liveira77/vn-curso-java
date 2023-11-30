package com.curso.vuelos.service;

import java.util.List;

import com.curso.vuelos.model.Vuelo;

public interface VuelosService {
	Boolean addVuelo(Vuelo vuelo);
	List<Vuelo> getVuelos();
	List<Vuelo> getVuelosDisponibles(int plaza);
	Boolean updVuelo(int idVuelo, int plazasReservadas);
	Boolean hasPlazas(int idVuelo, int plazasReservadas);
}
