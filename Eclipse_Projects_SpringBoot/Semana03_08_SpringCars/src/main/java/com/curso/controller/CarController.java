package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Car;
import com.curso.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService cs;

	// GET localhost:8080/cars
	@GetMapping(value = "cars", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> getCars() {
		return cs.getCars();
	}

	// GET localhost:8080/cars/{plate}
	@GetMapping(value = "cars/{plate}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Car getCar(@PathVariable("plate") String plate) {
		return cs.getCar(plate);
	}

	// POST localhost:8080/cars
	@PostMapping(value = "cars", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> addCar(@RequestBody Car car) {
		return cs.addCar(car);
	}

	// PUT localhost:8080/cars
	@PutMapping(value = "cars", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> updateCar(@RequestBody Car car) {
		return cs.updateCar(car);
	}

	// DELETE localhost:8080/cars/{plate}
	@DeleteMapping(value = "cars/{plate}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> deleteCar(@PathVariable("plate") String plate) {
		return cs.deleteCar(plate);
	}
}
