package com.curso.reservas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.reservas.dao.ReservasDAO;
import com.curso.reservas.dto.NuevaReservaDTO;
import com.curso.reservas.exceptions.HotelNoDisponibleException;
import com.curso.reservas.exceptions.ReservaException;
import com.curso.reservas.exceptions.VueloNoDisponibleException;
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
	        // Verificar si hay plazas en el vuelo
	        String urlHasPlazas = urlVuelos + "/hasplazas/" + nuevaReserva.getIdVuelo() + "/" + nuevaReserva.getPersonas();
	        Boolean hasPlazas = template.getForObject(urlHasPlazas, Boolean.class);
	        
	        if (!hasPlazas) {
	            throw new VueloNoDisponibleException("Voo não tem vagas suficientes.");
	        }

	        // Verificar si el Hotel esta disponible
	        String urlIsHotelDisponible = urlHotels + "/disponibles/" + nuevaReserva.getIdHotel();
	        Boolean isHotelDisponible = template.getForObject(urlIsHotelDisponible, Boolean.class);

	        if (!isHotelDisponible) {
	            throw new HotelNoDisponibleException("Hotel não está disponível.");
	        }

	        //Si tudo OK, crear una nueva reserva
	        Reserva reserva = new Reserva();
	        reserva.setCliente(nuevaReserva.getCliente());
	        reserva.setDni(nuevaReserva.getDni());
	        reserva.setIdHotel(nuevaReserva.getIdHotel());
	        reserva.setIdVuelo(nuevaReserva.getIdVuelo());

	        // Actualizar plazas del vuelo
	        String urlUdpPlazas = urlVuelos + "/reserve/" + nuevaReserva.getIdVuelo() + "/" + nuevaReserva.getPersonas();
	        template.put(urlUdpPlazas, null);
	        return dao.save(reserva);

	    } catch (DataIntegrityViolationException e) {
	        e.printStackTrace();
	        throw new ReservaException("Erro de integridade de dados ao criar reserva.", e);
	    } catch (VueloNoDisponibleException e) {
	        e.printStackTrace();
	        throw new ReservaException("Voo não tem vagas suficientes.");
	    } catch (HotelNoDisponibleException e) {
	        e.printStackTrace();
	        throw new ReservaException("Hotel não está disponível.");
	    } catch (Exception e) {
	        e.printStackTrace();
	        throw new ReservaException("Erro inesperado ao criar reserva.", e);
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
