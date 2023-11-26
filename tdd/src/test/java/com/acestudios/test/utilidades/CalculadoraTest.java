package com.acestudios.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.acestudios.utilidades.calculadora.Calculadora;

class CalculadoraTest {
	
	// arrange stage
	Calculadora calc = new Calculadora();

	@Test
	@DisplayName("suma de dos numeros")
	void testSuma() {
		// act stage
		double res = calc.sumar(2, 2);
		// assert stage
		assertEquals(4, res);
	}
	
	@Test
	@DisplayName("resta de dos numeros")
	void testResta() {
		// act stage
		double res = calc.restar(4,  2);
		assertEquals(2, res);
	}
	
	@Test
	@DisplayName("multiplicacion de dos numeros")
	void testMultiplicacion() {
		double res = calc.multiplicar(4, 2);
		assertEquals(8, res);
	}
	
	@Test
	@DisplayName("division de dos numeros")
	void testDivision() {
		double res = calc.dividir(4, 2);
		assertEquals(2, res);
	}

}
