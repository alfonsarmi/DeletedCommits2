package com.github.stokito.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(4, calculator.multiply(2, 2));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	@Test
	public void testSquare() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(4, calculator.square(2));
	}

	@Test
	public void testCube() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(8, calculator.cube(2));
	}

	@Test
	public void testSquareRoot() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.squareRoot(4));
	}

	@Test
	public void testSin() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2.71, calculator.sin(2));
	}

	@Test
	public void testCos() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2.71, calculator.cos(2));
	}

	@Test
	public void testTan() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2.71, calculator.tan(2));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calculator calculator = new Calculator();
		calculator.divide(6, 0);
	}
}