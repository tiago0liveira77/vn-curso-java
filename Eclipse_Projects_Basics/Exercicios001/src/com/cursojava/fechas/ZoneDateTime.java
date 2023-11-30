package com.cursojava.fechas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {
	public static void main(String[] args) {
		ZoneId zonaHoraria = ZoneId.of("Europe/Madrid");
		ZonedDateTime fechaHoraActual = ZonedDateTime.now(zonaHoraria);
		
		System.out.println("Fecha y hora actuall: " +fechaHoraActual);
		
		ZoneId zonaHorariaNewYork = ZoneId.of("America/New_York");
		ZonedDateTime fechaHoraActualNewYork = fechaHoraActual.withZoneSameInstant(zonaHorariaNewYork);
		
		System.out.println("Fecha y hora actual en New York: " + fechaHoraActualNewYork);
		
		ZonedDateTime fechaHora = ZonedDateTime.of(2023, 11,13, 14,30,0,0,ZoneId.of("Asia/Tokyo"));
		System.out.println("Fecha y hora en Tokyo: " + fechaHora);
		
		ZonedDateTime dentroDeDosHorasEnTokio = fechaHora.plusHours(2);
		System.out.println("Fecha y hora em Tokio dentro de dos horas: " + dentroDeDosHorasEnTokio);
		
		ZonedDateTime dosSemanasAntesEnTokio = fechaHora.minusWeeks(2);
		System.out.println("Fecha y hora en Tokio dos semanas antes: " + dosSemanasAntesEnTokio);
		
		
		//sameInstant, sameLocalDate, sameLocalTime, .....
		
		ZonedDateTime fechaHoraMadrid = dosSemanasAntesEnTokio.withZoneSameInstant(zonaHoraria);
		System.out.println("Fecha y hora en Madrid respecto a dos semanas antes en tokio: "+ fechaHoraMadrid);
		
		
				
	}
}
