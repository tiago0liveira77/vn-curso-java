package com.curso.reservas.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * Indicamos donde van a estar nuestro servicio, dao y entidad
 * 
 *
 * @see com.curso.reservas.service.ReservasService
 * @see com.curso.reservas.controller.ReservasController
 * @see com.curso.reservas.dao.ReservasDAO
 */

@EntityScan(basePackages="com.curso.reservas.model")
@EnableJpaRepositories(basePackages="com.curso.reservas.dao")
@SpringBootApplication(scanBasePackages={"com.curso.reservas.service", "com.curso.reservas.controller"})
public class Semana040603FinalProjectReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana040603FinalProjectReservasApplication.class, args);
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
