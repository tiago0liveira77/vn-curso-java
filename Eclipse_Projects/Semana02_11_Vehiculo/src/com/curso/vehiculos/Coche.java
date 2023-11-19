package com.curso.vehiculos;

public class Coche extends Vehiculo {
	private final int num_rodas = 4;
	private double distanciaRecorrida;
	private double tiempoDeViaje;
	private boolean enMovimiento;

	public Coche(String matricula, String color, double distanciaRecorrida, double tiempoDeViaje,
			boolean enMovimiento) {
		super(matricula, color);
		this.distanciaRecorrida = distanciaRecorrida;
		this.tiempoDeViaje = tiempoDeViaje;
		this.enMovimiento = enMovimiento;
	}

	@Override
	public void avanzar(double distancia) {
		if (!enMovimiento) {
			enMovimiento = true;
			this.tiempoDeViaje = System.currentTimeMillis();
		}
		this.distanciaRecorrida += distancia;
	}

	@Override
	public void retroceder(double distancia) {
		// TODO Auto-generated method stub
		this.distanciaRecorrida += distancia;
	}

	@Override
	public void parar() {
		if (enMovimiento) {
			enMovimiento = false;
			this.tiempoDeViaje = System.currentTimeMillis() - this.tiempoDeViaje;
		}
	}

	@Override
	public double velocidad(float espacio, float tiempo) {
		return espacio/tiempo;
	}

}
