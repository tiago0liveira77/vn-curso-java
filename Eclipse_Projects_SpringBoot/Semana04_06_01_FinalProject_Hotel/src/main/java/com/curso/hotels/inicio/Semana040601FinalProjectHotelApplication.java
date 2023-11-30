package com.curso.hotels.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Indicamos donde van a estar nuestro servicio, dao y entidad
 * 
 *
 * @see com.curso.hotels.service
 * @see com.curso.hotels.controller
 * @see com.curso.hotels.dao
 */
@EntityScan(basePackages="com.curso.hotels.model")
@EnableJpaRepositories(basePackages="com.curso.hotels.dao")
@SpringBootApplication(scanBasePackages={"com.curso.hotels.service", "com.curso.hotels.controller"})
public class Semana040601FinalProjectHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana040601FinalProjectHotelApplication.class, args);
	}

}
