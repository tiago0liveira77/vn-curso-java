package com.curso.cole.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.curso.cole.Nota;
import com.curso.cole.Tipo;

class NotaTest {

	Nota nota1 = null;
	Nota nota2 = null;
	Nota nota3 = null;
	Nota nota4 = null;
	Nota nota5 = null;
	Nota nota6 = null;
	Nota nota7 = null;

	@BeforeEach
	public void setup() {
		nota1 = new Nota(8, "lengua");
		nota2 = new Nota(5, "lengua");
		nota3 = new Nota(8, "matematica");
		nota4 = new Nota(8, "lengua");
		nota5 = new Nota(8, "lengua");
		nota6 = new Nota(855, "lengua");
		nota7 = new Nota(7, "lengua");
	}

	@Test
	void mesmaSignatura() {

		boolean esMima = nota1.esMismaAsignatura(nota2);
		assertTrue(esMima);

		boolean esDistincta = nota1.esMismaAsignatura(nota3);
		assertFalse(esDistincta);

	}

	@Test
	void mesmaNota() {

		boolean esMima = nota4.equals(nota5);
		assertTrue(esMima);

		boolean esDif = nota1.equals(nota2);
		assertFalse(esDif);
	}

	@Test
	void notaMaior() {

		boolean esMayor = nota1.esMayor(nota2);
		assertTrue(esMayor);

		boolean esMayor2 = nota2.esMayor(nota1);
		assertFalse(esMayor2);

	}

	@Test
	void notaMaiorDiffAsignatura() {
		assertThrows(RuntimeException.class, () -> nota1.esMayor(nota3));
	}
	
	@Test
	void notaTipoInvalid() {
		assertEquals(Tipo.INVALID, nota6.getTipo());
	}
	
	@Test
	void notaTipoBOM() {
		assertEquals(Tipo.BOM, nota7.getTipo());
	}

}
