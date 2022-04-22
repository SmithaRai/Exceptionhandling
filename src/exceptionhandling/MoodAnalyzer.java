package exceptionhandling;

public class MoodAnalyzer {
	
	void analysemood(String message)
	{
		if(message == "Iam in Any Mood")
			System.out.println("HAPPY");
	}

	public static void main(String[] args) {
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*CUSTOM EXCEPTION HANDLING-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
		System.out.println(" ");
		MoodAnalyzer mood = new MoodAnalyzer();
		 mood.analysemood("Iam in Any Mood");
	}
}
