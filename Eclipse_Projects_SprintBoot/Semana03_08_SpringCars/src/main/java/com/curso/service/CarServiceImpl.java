package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Car;

@Service
public class CarServiceImpl implements CarService{
	
	List<Car> cars;
	
	public CarServiceImpl() {
		super();
		cars = new ArrayList();
		cars.add(new Car("00AA12", "Renault", "Clio", 1900, 2004));
		cars.add(new Car("30BB00", "Renault", "Megane", 1500, 2004));
		cars.add(new Car("44CC00", "Audi", "A3", 1900, 2004));
		cars.add(new Car("66DD80", "Seat", "Ibiza", 1900, 2004));
		cars.add(new Car("77EE97", "Citroen", "C3", 1400, 2012));
	}

	@Override
	public List<Car> getCars() {
		return cars;
	}

	@Override
	public Car getCar(String plate) {
		return cars
				.stream()
				.filter(c->c.getPlate().equals(plate))
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<Car> addCar(Car car) {
		cars.add(car);
		return cars;
	}

	@Override
	public List<Car> updateCar(Car car) {
		Car c = getCar(car.getPlate());
		if(c!=null) {
			c.setBrand(car.getBrand());
			c.setModel(car.getModel());
			c.setCc(car.getCc());
			c.setYear(car.getYear());
		}
		
		return cars;
	}

	@Override
	public List<Car> deleteCar(String plate) {
		Car c = getCar(plate);
		cars.remove(c);
		return cars;
	}

}
