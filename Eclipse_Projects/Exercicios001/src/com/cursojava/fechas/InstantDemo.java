package com.cursojava.fechas;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		Instant now = Instant.now();
		
		System.out.println("Instante actual : " + now);
		
		Instant futuro = now.plusSeconds(3600); //Sumo 1 hora
		System.out.println("Instante futuro: " +futuro);
		
		Duration duration = Duration.ofHours(2);
		futuro = futuro.plus(duration);
		System.out.println(" Podemos trabajar con duraciones e instantes: " + futuro);
		

	}

}
