package com.cursojava.fechas;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EjemploFechasHoras {

	public static void main(String[] args) {

		LocalDateTime hoyYahora= LocalDateTime.now();
		System.out.println("LocalDateTime Fecha y hora actual:" +hoyYahora);
		
		//LocalDateTime dentroDeUnaHora
		
		//LocalDateTime dentroDeUnAnyo
		
		//LocalDateTime haceUnMes
		
		//LocalDateTime haceUna Semana
		
		LocalDateTime fechaYhoraEspecifica = LocalDateTime.of(2023, 07, 30, 10, 23 );
		System.out.println("LocalDateTime Fecha y hora especifica:" + fechaYhoraEspecifica);
		
		//int dia = fechaYhoraEspecifica.getDayOfMonth();
		//int mes = 
		//int anyo =
		//int hora =
		//int minuto =
		//int segundo =
		
		//Para formatear fechas y analizar fechas en distintos formatos
		// DateTimeFormatter
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Fecha formateada según el patrón indicado: " +formateador.format(LocalDateTime.now()));
		// parse convierte un String en un objeto LocalDateTime
		String textoFecha = "15/09/2023 14:30:00";   // ESTABAN MAL PUESTOS LOS - (15-09-2023 14:30:00)  
		LocalDateTime fechaHora = formateador.parse(textoFecha,LocalDateTime::from);
		System.out.println("fecha formateada: " + formateador.format(fechaHora));
	
		DateTimeFormatter formateadorConLocaleEs = formateador.withLocale(Locale.forLanguageTag("es-ES"));
		System.out.println("Fecha formateada con Locale ES: "+ formateadorConLocaleEs.format(fechaHora));
			 
		ZoneId zonaHoraria = ZoneId.of("Europe/Madrid");
		DateTimeFormatter formateadorConZona = formateador.withZone(zonaHoraria);
		System.out.println("Fecha formateada con zona horaria: " + formateadorConZona.format(fechaHora)+ " "+
		formateadorConZona.getZone());
		
	}

}
