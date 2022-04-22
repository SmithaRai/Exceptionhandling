package exceptionhandling;

import java.util.Scanner;

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
		String s1 = "Iam in Any Mood";
		String s2 = "Iam in Sad Mood";
		
	    try {	
		     if ( message.contains(s1))
			
			      return "HAPPY";
	     
		      else if( message.contains(s2))
		    
			      return "SAD";
		     
		      else
		        {     }
             throw new MoodAnalysisException(message);
	        }
	    catch(MoodAnalysisException e) {
	    	
	    	  System.out.println(e);
		      return "invalid input";
	          }
	        }

	public static void main(String[] args) {
		String msg;
		Scanner scan = new Scanner(System.in);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*CUSTOM EXCEPTION HANDLING-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
		System.out.println(" ");
		System.out.println("ENTER 'Iam in Sad Mood' or 'Iam in Any Mood' TO VIEW RESPONSE :");
		msg = scan.nextLine();
	
		MoodAnalyzer mood = new MoodAnalyzer(msg);
		
		System.out.println("MOOD : "+ mood.analysemood());
	}
}
