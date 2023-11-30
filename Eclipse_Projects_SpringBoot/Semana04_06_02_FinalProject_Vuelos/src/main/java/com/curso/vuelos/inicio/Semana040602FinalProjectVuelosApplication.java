package com.curso.vuelos.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Indicamos donde van a estar nuestro servicio, dao y entidad
 * 
 *
 * @see com.curso.vuelos.service
 * @see com.curso.vuelos.controller
 * @see com.curso.vuelos.dao
 */

@EntityScan(basePackages="com.curso.vuelos.model")
@EnableJpaRepositories(basePackages="com.curso.vuelos.dao")
@SpringBootApplication(scanBasePackages={"com.curso.vuelos.service", "com.curso.vuelos.controller"})
public class Semana040602FinalProjectVuelosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana040602FinalProjectVuelosApplication.class, args);
	}

}
