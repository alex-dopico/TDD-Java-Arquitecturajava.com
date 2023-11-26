package com.acestudios.test.escuela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.acestudios.escuela.Nota;

class NotaTest {
	@DisplayName("nota con misma asignatura?")
	@Test
	public void dosAsignaturasIguales() {
		// arrange stage
		Nota nota1 = new Nota("Matemáticas", 6);
		Nota nota2 = new Nota("Matemáticas", 4);
		
		// act stage
		boolean esMisma = nota1.esMismaAsignatura(nota2);
		
		// assert stage
		assertTrue(esMisma);
	}
	
	@DisplayName("son diferentes asignaturas?")
	@Test
	public void dosAsignaturasDiferentes() {
		Nota nota1 = new Nota("Matematicas", 9);
		Nota nota2 = new Nota("Lengua", 7);
		
		boolean esMisma = nota1.equals(nota2);
		
		assertFalse(esMisma);
	}
	
	@DisplayName("es mayor nota1 que nota2?")
	@Test
	public void nota1MayorqueNota2() {
		Nota nota1 = new Nota("Matematicas", 9);
		Nota nota2 = new Nota("Matematicas", 7);
		
		boolean esMayor = nota1.getValor() > nota2.getValor();
		
		assertTrue(esMayor);
	}
}
