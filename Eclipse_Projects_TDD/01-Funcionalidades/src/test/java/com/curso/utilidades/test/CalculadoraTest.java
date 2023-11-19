package com.curso.utilidades.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.curso.utilidades.Calculadora;

class CalculadoraTest {

	@Test
	void testSumar() {
		//arranque
		Calculadora calculadora = new Calculadora();
		
		//act
		double suma = calculadora.somar(2, 2);
		
		//assert
		assertEquals(4, suma);
	}
	
	@Test
	void testRestar() {
		//arranque
		Calculadora calculadora = new Calculadora();
		
		//act
		double restar = calculadora.restar(5, 2);
		
		//assert
		assertEquals(3, restar);
	}

}
