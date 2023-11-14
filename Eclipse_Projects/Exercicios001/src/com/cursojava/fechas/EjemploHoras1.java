package com.cursojava.fechas;

import java.time.LocalTime;

public class EjemploHoras1 {

	public static void main(String[] args) {

		LocalTime ahora = LocalTime.now();
		System.out.println("Hora actual: " + ahora);
		
		LocalTime masTarde = ahora.plusHours(2);
		System.out.println("Dentro de dos horan serán las: " + masTarde);
		
		LocalTime antes = ahora.minusHours(2);
		System.out.println("Hace dos horas eran las: "+ antes);

		LocalTime test = ahora.withHour(07).withMinute(30).withSecond(00);
		System.out.println("Cambiando la hora actual: " + test);
		
		LocalTime horaEspecificada = LocalTime.of(10, 23); // Representa las 10:23
		
		System.out.println("Local Time Hora especificada: " + horaEspecificada);
		
		int hora = ahora.getHour();
		int minuto = ahora.getMinute();
		int segundo = ahora.getSecond();
		
		System.out.println("Local Time Hora: " + hora + " Minuto: " +minuto + " Segundo: "+ segundo);
		
		boolean esAntesDe = ahora.isBefore(horaEspecificada);
		boolean esDespuesDe = ahora.isAfter(horaEspecificada);
		System.out.println("LocalTime ¿Es antes de las 10:23? " + esAntesDe);
		System.out.println("LocalTime ¿Es después de las 10:23? " + esDespuesDe);	
	}

}
