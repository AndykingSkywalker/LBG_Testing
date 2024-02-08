package testDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculator.Calc;

public class CalcTest {

	private Calc calculator = new Calc();

	@Test
	void addTest() {
		Assertions.assertEquals(8, this.calculator.add(4, 4));
	}

	@Test
	void subtractTest() {
		Assertions.assertEquals(2, this.calculator.subtract(10, 8));
	}

	@Test
	void multiplyTest() {
		Assertions.assertEquals(100, this.calculator.multiply(50, 3));
	}

	@Test
	void divideTest() {
		Assertions.assertEquals(7.5, this.calculator.divide(15, 2));
	}
}
