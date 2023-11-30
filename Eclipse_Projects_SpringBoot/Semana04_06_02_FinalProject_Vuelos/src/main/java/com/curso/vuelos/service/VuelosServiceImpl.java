package com.curso.vuelos.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.curso.vuelos.dao.VuelosDAO;
import com.curso.vuelos.model.Vuelo;

/**
 * Clase servicio, dónde implementamos los métodos de la interfaz
 *
 * @see com.curso.vuelos.service
 * @see com.curso.vuelos.dao
 */
@Service
public class VuelosServiceImpl implements VuelosService {
	/**
     * Inyectamos el dao que extiende de JpaRepository para poder acceder a los metodos 
     */
	@Autowired
	VuelosDAO dao;

	@Override
	public List<Vuelo> addVuelo(Vuelo vuelo) {
		try {
			dao.save(vuelo);
			return getVuelos();
		} catch (DataIntegrityViolationException e) {
			// Si hay Duplicated Primary Key
			e.printStackTrace();
			return getVuelos();
		} catch (Exception e) {
			e.printStackTrace();
			return getVuelos();
		}
	}

	@Override
	public List<Vuelo> getVuelos() {
		try {
			return dao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	@Override
	public List<Vuelo> getVuelosDisponibles(int plaza) {
		try {
			return dao.findByPlazaGreaterThanEqual(plaza);
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	@Override
	public void updVuelo(int idVuelo, int plazasReservadas) {
		try {
			// Verifica si el vuelo existe
			Vuelo vuelo = dao.findById(idVuelo).orElse(null);
			if (vuelo != null) {
				if (hasPlazas(vuelo.getIdVuelo(), plazasReservadas)) {
					vuelo.setPlaza(vuelo.getPlaza() - plazasReservadas);
					dao.save(vuelo);
					return;
				}
			} 
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

	@Override
	public Boolean hasPlazas(int idVuelo, int plazasReservadas) {
		try {
			// Verifica si el vuelo existe
			Vuelo vuelo = dao.findById(idVuelo).orElse(null);
			if (vuelo != null) {
				return (vuelo.getPlaza() >= plazasReservadas) ? true : false;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
