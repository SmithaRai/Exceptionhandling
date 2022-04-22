package exceptionhandling;

public class MoodAnalyzer {
	
	void analysemood(String message)
	{
		if(message == "Happy")
			System.out.println("happy mood");
		else
			System.out.println("sad mood");
	}

	public static void main(String[] args) {
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*CUSTOM EXCEPTION HANDLING-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
		System.out.println(" ");
		MoodAnalyzer mood = new MoodAnalyzer();
		 mood.analysemood("Happy");
	}
}
