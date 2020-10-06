public class MoodAnalyser {
	public String message;
	public MoodAnalyser() { // default constructor

	}
	public MoodAnalyser(String message) { // parameterized constructor
		this.message = message; // UC1
	}
	public static void main(String[] args) throws MoodAnalysisException {
		MoodAnalyser moodanalyzer = new MoodAnalyser(null);
		System.out.println("Mood of a person is: " + moodanalyzer.analyseMood());
	}
	public String analyseMood() throws MoodAnalysisException {
		MoodEnum input1 = MoodEnum.NULL;
		MoodEnum input2 = MoodEnum.EMPTY;
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";
		} catch (NullPointerException e) {                                                                                     // Null input exception
			MoodAnalysisException moodanalyzerexception = new MoodAnalysisException("Mood of a person can't be: " + input1);
			throw moodanalyzerexception;                                                                                       // UC2
		}
		if (message == "")
			throw new MoodAnalysisException("Mood of a person can't be: " + input2);
		return "HAPPY";
	}
}