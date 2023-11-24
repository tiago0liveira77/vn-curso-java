package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.model.Car;
import com.curso.service.CarServiceImpl;

@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service"})
public class Semana0308SpringCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Semana0308SpringCarsApplication.class, args);
		
		CarServiceImpl csi = new CarServiceImpl();
		for(Car c:csi.getCars()){
			System.out.println(c);
		}
	}

}
