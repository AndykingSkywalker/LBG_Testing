package testDemo.factorialExercise;

public class Factorials {

	public static void main(String[] args) {
		System.out.println(reverseFactorial(120));
	}

	public static String reverseFactorial(int num) {

		int i = 1;

		while (num > 1) {

			i++;

			num /= i;
		}
		if (num == 1) {
			return i + "!";
		} else {
			return "None";
		}
	}

}
