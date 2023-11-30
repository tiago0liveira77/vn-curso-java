package com.curso.reservas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.curso.reservas.exceptions.HotelNoDisponibleException;
import com.curso.reservas.exceptions.ReservaException;
import com.curso.reservas.exceptions.VueloNoDisponibleException;

/**
 * GlobalExceptionHandler es un @ControllerAdvice
 * que permite personalizar los "traces" 
 * de las excepciones
 * 
 * @see com.curso.reservas.exceptions
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VueloNoDisponibleException.class)
    public ResponseEntity<String> handleVueloNoDisponible(VueloNoDisponibleException e) {
    	// Devuelve sólo el mensaje de excepción personalizado.
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
    
    @ExceptionHandler(HotelNoDisponibleException.class)
    public ResponseEntity<String> handleHotelNoDisponible(HotelNoDisponibleException e) {
    	// Devuelve sólo el mensaje de excepción personalizado.
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }

    @ExceptionHandler(ReservaException.class)
    public ResponseEntity<String> handleReservaException(ReservaException e) {
    	// Devuelve sólo el mensaje de excepción personalizado.
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(e.getMessage());
    }

}

