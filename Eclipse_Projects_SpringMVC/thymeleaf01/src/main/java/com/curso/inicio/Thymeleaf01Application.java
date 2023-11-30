package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.curso.controller"})
public class Thymeleaf01Application {

	public static void main(String[] args) {
		SpringApplication.run(Thymeleaf01Application.class, args);
	}

}
