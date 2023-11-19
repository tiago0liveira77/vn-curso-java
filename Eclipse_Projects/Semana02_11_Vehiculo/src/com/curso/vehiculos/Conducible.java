package com.curso.vehiculos;

public interface Conducible {
	public void avanzar(double distancia);
	public void retroceder(double distancia);
	public void parar();
	public double velocidad(float espacio, float tiempo);
}
