package com.curso.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo implements Conducible {
	private List<Double> tacometro;

	public Camion(String matricula, String color) {
		super(matricula, color);
		this.tacometro = new ArrayList<>();
	}

	@Override
	public void avanzar(double distancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retroceder(double distancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double velocidad(float espacio, float tiempo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
