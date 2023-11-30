package com.cursojava.fechas;

import java.time.Duration;
import java.time.Period;

public class DurationDemo {

	public static void main(String[] args) {
		Duration ochoHoras = Duration.ofHours(8);		
		Duration quinceMinutos = Duration.ofMinutes(15);		
		Duration resultado = ochoHoras.plus(quinceMinutos);
		
		System.out.println("Resultado: " + resultado);
		
		Duration duracion = Duration.ofMinutes(60).plusSeconds(30).plusNanos(5000);
		
		double segundo1 = duracion.toSeconds();
		double segundo2 = duracion.getSeconds();
		double segundo3 = duracion.toSecondsPart();
		
		System.out.println("----toSeconds: " + segundo1);
		System.out.println("----getSeconds: " + segundo2);
		System.out.println("----toSecondsPart: " + segundo3);
		
		double minutos1 = duracion.toMinutes();
		double minutos2 = duracion.toMinutesPart();
		double minutos3 = duracion.toHours();
		
		System.out.println("----toMinutes: " + minutos1);
		System.out.println("----toMinutesPart: " + minutos2);
		System.out.println("----toHours: " + minutos3);
		
		
		Period periodo = Period.of(2,3,5);
		Period otroPeriodo = Period.of(1,2,10);
		
		Period resultadoPeriodo = periodo.plus(otroPeriodo);
		
		System.out.println("Periodo total: " + resultadoPeriodo.getYears()+ " años, "+
							resultadoPeriodo.getMonths() + " meses, "+
							resultadoPeriodo.getDays() + " días");
		
		
	}

}
