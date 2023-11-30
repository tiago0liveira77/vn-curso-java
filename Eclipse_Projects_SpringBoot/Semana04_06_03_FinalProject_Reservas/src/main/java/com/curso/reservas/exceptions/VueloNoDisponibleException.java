package com.curso.reservas.exceptions;

public class VueloNoDisponibleException extends RuntimeException  {
	
	public VueloNoDisponibleException(String message) {
		super(message);
	}

}
