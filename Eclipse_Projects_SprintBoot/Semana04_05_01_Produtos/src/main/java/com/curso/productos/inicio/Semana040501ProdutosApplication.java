package com.curso.productos.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.curso.productos.model")
@EnableJpaRepositories(basePackages="com.curso.productos.dao")
@SpringBootApplication(scanBasePackages={"com.curso.productos.service", "com.curso.productos.controller"})
public class Semana040501ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana040501ProdutosApplication.class, args);
	}

}
