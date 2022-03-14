package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PremiertestTest {

	@Test
	void testAddTwoPositiveNumbers() {
		// Arrange
		int a = 2, b = 3;
		Premiertest premiertest = new Premiertest();

		// Act
		int somme = premiertest.add(a, b);
		float multiplication = premiertest.multiplication(a, b);

		// Assert
		assertEquals(5, somme);
		assertEquals(6, multiplication);

	}

}
