public class MoodAnalyser {
	String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood() throws MoodAnalysisException{
		try {
			if(message.equalsIgnoreCase("I am in sad mood")) {
				return "SAD";
			}
		}
		catch(NullPointerException exception) {
			throw new MoodAnalysisException("No "+ MoodEnum.NULL + " value accepted. Please enter a valid mood.");
		}
		
		if(message.length() == 0) {
			throw new MoodAnalysisException("No "+ MoodEnum.EMPTY + " value accepted. Please enter a valid mood.");
		}
		
		else {
			return "HAPPY";
		}
	}	
}
