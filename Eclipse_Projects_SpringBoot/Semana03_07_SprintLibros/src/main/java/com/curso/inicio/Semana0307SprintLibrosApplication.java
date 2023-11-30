package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.model.Libro;
import com.curso.service.LibrosServiceImpl;

@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service"})
public class Semana0307SprintLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana0307SprintLibrosApplication.class, args);
		
		LibrosServiceImpl ls = new LibrosServiceImpl();
		for(Libro l: ls.libros()) {
			System.out.println(l.toString());
		}
		;
	}

}
