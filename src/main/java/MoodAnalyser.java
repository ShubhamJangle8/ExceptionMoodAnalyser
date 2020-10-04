import java.util.Scanner;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood(){
		Scanner sc = new Scanner(System.in);
		try {
			if(message.equalsIgnoreCase("I am in sad mood")) {
				return "SAD";
			}
			else {	
				return "HAPPY";
			}
		}
		catch(NullPointerException Null) {
			return "HAPPY";
		}
	}	
}
