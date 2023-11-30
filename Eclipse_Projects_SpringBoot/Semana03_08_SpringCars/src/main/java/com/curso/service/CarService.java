package com.curso.service;

import java.util.List;

import com.curso.model.Car;

public interface CarService {
	List<Car> getCars();
	Car getCar(String plate);
	List<Car> addCar(Car car);
	List<Car> updateCar(Car car);
	List<Car> deleteCar(String plate);
}
