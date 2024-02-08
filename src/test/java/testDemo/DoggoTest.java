package testDemo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import doggoExercise.DoggoCompetition;

public class DoggoTest {

	private DoggoCompetition doggoContest = new DoggoCompetition();

	@Test
	void doggoTest() {
		List<String> result = this.doggoContest.doggoPlaces(12);
		Assertions.assertFalse(result.contains("12th"));
	}
}
