package doggoExercise;

import java.util.ArrayList;

public class DoggoCompetition {

	public static void main(String[] args) {

		doggoPlaces();

	}

	public static void doggoPlaces() {

		ArrayList<String> places = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			places.add("Position: " + i);
		}
		System.out.println(places);
	}

}
