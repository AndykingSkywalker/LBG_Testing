package testDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import factorialExercise.Factorials;

public class FactorialTest {

	private Factorials reverseFactorials = new Factorials();

	@Test
	void factorialTest() {
		Assertions.assertEquals("10!", this.reverseFactorials.reverseFactorial(3628800));
		Assertions.assertEquals("12!", this.reverseFactorials.reverseFactorial(479001600));
		Assertions.assertEquals("3!", this.reverseFactorials.reverseFactorial(6));
		Assertions.assertEquals("NONE", this.reverseFactorials.reverseFactorial(18));
	}

}
