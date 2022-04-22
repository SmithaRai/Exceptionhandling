package exceptionhandling;

public class MoodAnalyzer {
	
	String message;

		MoodAnalyzer()
		{
			
		}
		
		MoodAnalyzer(String message){
			
			this.message = message ;
			
		}
	String analysemood()
	{
		if (message == "Iam in Any Mood")
			return "HAPPY";
		else
			return "SAD";
	}

	public static void main(String[] args) {
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*CUSTOM EXCEPTION HANDLING-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
		System.out.println(" ");
		
		MoodAnalyzer mood = new MoodAnalyzer("Iam in Sad Mood");
		System.out.println("MOOD : "+ mood.analysemood());
		 
	}
}
