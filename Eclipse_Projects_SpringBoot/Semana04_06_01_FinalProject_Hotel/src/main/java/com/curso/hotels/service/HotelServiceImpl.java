package com.curso.hotels.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.curso.hotels.dao.HotelsDAO;
import com.curso.hotels.model.Hotel;

/**
 * Clase servicio, dónde implementamos los métodos de la interfaz
 *
 * @see com.curso.hotels.service
 * @see com.curso.hotels.dao
 */
@Service
public class HotelServiceImpl implements HotelsService {
	/**
     * Inyectamos el dao que extiende de JpaRepository para poder acceder a los metodos 
     */
	@Autowired
	HotelsDAO dao;

	@Override
	public List<Hotel> getHotels() {
		try {
            return dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList(); 
        }
	}
	
	@Override
	public List<Hotel> getHotelsAvailable(boolean disponible) {
		try {
			return dao.findByDisponible(disponible);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList(); 
        }	
	}

	@Override
	public Optional<Hotel> getHotelsByName(String hotel) {
		try {
			return dao.findByHotel(hotel);
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }	
	}
	
	@Override
	public List<Hotel> addHotel(Hotel hotel){
		try {
            dao.save(hotel);
            return getHotels();
        } catch (DataIntegrityViolationException e) {
        	//Si hay Duplicated Primary Key
            e.printStackTrace();
            return getHotels(); 
        }
        catch (Exception e) {
            e.printStackTrace();
            return getHotels(); 
        }
	}

	@Override
	public Boolean isHotelAvailable(int idHotel) {
		try {
			Hotel hotel = dao.findById(idHotel).orElse(null);
			if(hotel != null)
				if(hotel.isDisponible())
					return true;
			return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
	}

	@Override
	public int getHotelsIDByName(String nombre) {
		try {
			Hotel hotel = dao.findByHotel(nombre).orElse(null);
			if(hotel != null)
					return hotel.getIdHotel();
			return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; 
        }
	}

}
