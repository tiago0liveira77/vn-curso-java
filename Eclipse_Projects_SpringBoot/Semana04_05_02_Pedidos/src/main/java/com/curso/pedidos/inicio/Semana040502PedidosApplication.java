package com.curso.pedidos.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages="com.curso.pedidos.model")
@EnableJpaRepositories(basePackages="com.curso.pedidos.dao")
@SpringBootApplication(scanBasePackages={"com.curso.pedidos.service", "com.curso.pedidos.controller"})
public class Semana040502PedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana040502PedidosApplication.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
