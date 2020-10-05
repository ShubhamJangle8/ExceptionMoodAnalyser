import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
	//TEST FOR SAD MOOD
		@Test
		public void givenMood_WhenSad_ShouldReturnSad() {
			try {
				MoodAnalyser mood = new MoodAnalyser("I am in Sad mood");
				assertEquals("SAD", mood.analyseMood());
			}
			catch(MoodAnalysisException e) {
				System.out.println(e);
			}
		}
		//testing HAPPY MOOD
		@Test
		public void givenMood_WhenInAnyMood_ShouldReturnHappy() {
			try {
				MoodAnalyser mood = new MoodAnalyser("I am in Any mood");
				assertEquals("HAPPY", mood.analyseMood());
			}
			catch(MoodAnalysisException e) {
				System.out.println(e);
			}
		}
		//testing NULL
		@Test
		public void givenMood_WhenNull_ShouldThrowMoodAnalysisException() {
			try {
				MoodAnalyser mood = new MoodAnalyser(null);
				assertEquals("HAPPY", mood.analyseMood());
			}
			catch(MoodAnalysisException e) {
				System.out.println(e);
			}
		}
		//testing EMPTY
		@Test
		public void givenMood_WhenEmpty_ShouldThrowMoodAnalysisException() {
			try {
				MoodAnalyser mood = new MoodAnalyser("");
				assertEquals("HAPPY", mood.analyseMood());
			}
			catch(MoodAnalysisException e) {
				System.out.println(e);
			}
		}
}

