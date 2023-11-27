package com.curso.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.curso.model")
@EnableJpaRepositories(basePackages="com.curso.dao")
@SpringBootApplication(scanBasePackages={"com.curso.service", "com.curso.controller"})
public class Semana0401CursosTestIdeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Semana0401CursosTestIdeApplication.class, args);
    }

}
