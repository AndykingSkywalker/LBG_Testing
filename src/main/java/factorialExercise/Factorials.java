package factorialExercise;

public class Factorials {

	public static void main(String[] args) {
		System.out.println(Factorials.reverseFactorial(3628800));
		System.out.println(Factorials.reverseFactorial(479001600));
		System.out.println(Factorials.reverseFactorial(6));
		System.out.println(Factorials.reverseFactorial(18));
	}

	public static String reverseFactorial(int num) {
		int number = num;
		int divisor = 2;

		while (number % divisor == 0) {
			number /= divisor;
			divisor++;
		}
		return String.format("%d = ", num) + ((divisor % number == 0) ? String.format("%d!", divisor - 1) : "NONE");
	}

}
