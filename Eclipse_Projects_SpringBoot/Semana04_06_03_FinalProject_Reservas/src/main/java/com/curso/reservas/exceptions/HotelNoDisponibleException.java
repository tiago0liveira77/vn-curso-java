package com.curso.reservas.exceptions;

public class HotelNoDisponibleException extends RuntimeException {
	public HotelNoDisponibleException(String message) {
        super(message);
    }
}
