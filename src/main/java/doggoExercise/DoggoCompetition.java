package doggoExercise;

import java.util.ArrayList;
import java.util.List;

public class DoggoCompetition {

	public static void main(String[] args) {

		System.out.println(doggoPlaces(12));

	}

	public static List<String> doggoPlaces(int num) {

		ArrayList<String> places = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			if (i != num) {
				if (i == 1) {
					places.add(i + "st");
				}
				if (i == 2) {
					places.add(i + "nd");
				}
				if (i == 3) {
					places.add(i + "rd");
				} else if (i > 3) {
					places.add(i + "th");
				}

			}
		}
		return places;

	}
}
