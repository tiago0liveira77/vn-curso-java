package com.cursojava.fechas;
import java.time.LocalDate;

public class EjemploFechas1 {
	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println("LocalDate Día actual: "+ hoy);
		
		LocalDate dosSemanasMasTarde = hoy.plusWeeks(2);
		System.out.println("LocalDate Dentro de dos semanas:" + dosSemanasMasTarde);
		
		LocalDate tresDiasMasTarde = hoy.plusDays(3);
		System.out.println("LocalDate Dentro de tres días: " + tresDiasMasTarde);
						
		LocalDate ayer=hoy.minusDays(1);
		System.out.println("LocalDate ayer fue: "+ ayer);
		
		LocalDate fechaEspecifica = LocalDate.of(2023, 11, 29);
		System.out.println("LocalDate fecha especifica: "+ fechaEspecifica);
		
		int dia = fechaEspecifica.getDayOfMonth();
		int mes = fechaEspecifica.getMonthValue();
		int anyo = fechaEspecifica.getYear();
		System.out.println("LocalDate Día: "+ dia+ " Mes: " +mes+ " Año: "+anyo);
		
		boolean esAntesDe = hoy.isBefore(fechaEspecifica);
		boolean esDespuesDe = hoy.isAfter(fechaEspecifica);
		
		System.out.println("LocalDate ¿Es antes de 20/11/2023" + esAntesDe);
		System.out.println("LocalDate ¿Es después de 20/11/2023" + esDespuesDe);
		
		
	}
}
