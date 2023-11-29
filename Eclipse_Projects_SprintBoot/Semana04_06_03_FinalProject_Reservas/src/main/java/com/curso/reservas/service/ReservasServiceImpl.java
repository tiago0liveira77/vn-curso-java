package com.curso.reservas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.reservas.dao.ReservasDAO;
import com.curso.reservas.dto.NuevaReservaDTO;
import com.curso.reservas.model.Reserva;

@Service
public class ReservasServiceImpl implements ReservasService {
	@Autowired
	ReservasDAO dao;

	@Autowired
	RestTemplate template;

	private String urlHotels = "http://localhost:8080/hotels";
	private String urlVuelos = "http://localhost:9000/vuelos";

	@Override
	public Reserva addReserva(NuevaReservaDTO nuevaReserva) {
		try {
			//Verificar si hay plazas suficientes
			String urlHasPlazas = urlVuelos + "/hasplazas/" + nuevaReserva.getIdVuelo() + "/" + nuevaReserva.getPersonas();
			Boolean hasPlazas = template.getForObject(urlHasPlazas, Boolean.class);
			
			//Verificar si el Hotel está disponible
			String urlIsHotelDisponible = urlHotels + "/disponibles/" + nuevaReserva.getIdHotel();
			Boolean isHotelDisponible = template.getForObject(urlIsHotelDisponible, Boolean.class);
			
			if (hasPlazas && isHotelDisponible) {
				//Si hay plazas y el hotel esta disponible, crea una nueva reserva
				Reserva reserva = new Reserva();
				reserva.setCliente(nuevaReserva.getCliente());
				reserva.setDni(nuevaReserva.getDni());
				reserva.setIdHotel(nuevaReserva.getIdHotel());
				reserva.setIdVuelo(nuevaReserva.getIdVuelo());
				
				//Actualiza plazas en el vuelo
				String urlUdpPlazas = urlVuelos + "/reserve/" + nuevaReserva.getIdVuelo() + "/" + nuevaReserva.getPersonas();
				template.put(urlUdpPlazas, null);
				dao.save(reserva);
				return reserva;
			}
			return null;
		} catch (DataIntegrityViolationException e) {
			// Si hay Duplicated Primary Key
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Reserva> getReservas() {
		return dao.findAll();
	}

	@Override
	public List<Reserva> getReservasByHotelName(String nombreHotel) {
		String urlGetHotelID = urlHotels + "/id/" + nombreHotel;
		int idHotel = template.getForObject(urlGetHotelID, Integer.class);
		if(idHotel != -1) {
			return dao.findByIdHotel(idHotel);
		}
		return null;
	}

}
