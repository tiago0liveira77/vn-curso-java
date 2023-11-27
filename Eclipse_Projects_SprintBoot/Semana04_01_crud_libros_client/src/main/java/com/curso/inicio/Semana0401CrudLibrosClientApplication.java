package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages={"com.curso.service", "com.curso.controller"})
public class Semana0401CrudLibrosClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana0401CrudLibrosClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
