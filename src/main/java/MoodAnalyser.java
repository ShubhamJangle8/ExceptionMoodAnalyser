public class MoodAnalyser {
	public String analyseMood(String message){
		if(message.equalsIgnoreCase("I am in sad mood")) {
			return "SAD";
		}
		else {	
			return "HAPPY";
		}
	}
}
