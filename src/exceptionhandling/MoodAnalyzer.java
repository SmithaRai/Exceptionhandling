package exceptionhandling;

public class MoodAnalyzer {
	
	void analysemood(String message)
	{
		if(message == "Iam in Sad Mood")
			System.out.println("SAD");
	}

	public static void main(String[] args) {
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*CUSTOM EXCEPTION HANDLING-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
		System.out.println(" ");
		MoodAnalyzer mood = new MoodAnalyzer();
		 mood.analysemood("Iam in Sad Mood");
	}
}
