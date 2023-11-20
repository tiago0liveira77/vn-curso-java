package com.curso.utilidades.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.curso.utilidades.CambioPesetasEurosVice;

class CambioPresetasEurosViceTest {

	@Test
	void testPesetasToEuro() {
		// arranque
		CambioPesetasEurosVice cambio = new CambioPesetasEurosVice();

		// act
		double euros = cambio.pesetasToEuro(166.386);

		// assert
		assertEquals(1.00, euros);
	}

	@Test
	void testoEuroToPesetas() {
		// arranque
		CambioPesetasEurosVice cambio = new CambioPesetasEurosVice();

		// act
		double pesetas = cambio.EuroToPesetas(1.00);

		// assert
		assertEquals(166.386, pesetas);
	}

}
