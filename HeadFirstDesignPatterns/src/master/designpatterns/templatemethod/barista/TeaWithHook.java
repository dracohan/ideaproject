package master.designpatterns.templatemethod.barista;

import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class TeaWithHook extends CaffeineBeverageWithHook {
 
	public void brew() {
		System.out.println("Steeping the tea");
	}
 
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
 
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		// get the user's response
		String answer = null;

		System.out.print("Would you like lemon with your tea (y/n)? ");

		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {

		InputStream in = System.in;
		InputStreamReader charsIn = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader( charsIn);
		String line = bufferedReader.readLine();
		//int i = NumberFormat.getInstance().parse( line ).intValue();
		answer = line;


			//answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}

		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
