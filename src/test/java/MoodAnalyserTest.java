import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	@Test
	void givenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser();
		String getMood = mood.analyseMood("I am in sad mood");
		assertEquals("SAD",getMood);
	}
	@Test
	void givenMood_WhenInAnyMood_ShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser();
		String getMood = mood.analyseMood("I am in any mood");
		assertEquals("HAPPY",getMood);
	}
}
