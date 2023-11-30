package com.curso.model;

public class Car {
	private String plate;
	private String brand;
	private String model;
	private int cc;
	private int year;
	
	public Car() {
		super();
	}

	public Car(String plate, String brand, String model, int cc, int year) {
		super();
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.cc = cc;
		this.year = year;
	}
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand + ", model=" + model + ", cc=" + cc + ", year=" + year + "]";
	}
	
	
	
	
}
