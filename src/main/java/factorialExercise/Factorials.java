package factorialExercise;

public class Factorials {

	public static void main(String[] args) {
		System.out.println(Factorials.reverseFactorial(3628800));
		System.out.println(Factorials.reverseFactorial(479001600));
		System.out.println(Factorials.reverseFactorial(6));
		System.out.println(Factorials.reverseFactorial(18));
	}

	public static String reverseFactorial(double num) {
		int i = 1;
		while (num > 1) {
			num /= ++i;
		}
		if (num == 1) {
			return i + "!";
		}
		return "NONE";

	}

}
