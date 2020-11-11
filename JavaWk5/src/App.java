import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
					
		String[] wordOptions = {"Hello","XX","Dynamic","ReallyLongWord"};
		Logger spaced = new SpacedLogger();
		Logger asterisk = new AsteriskLogger();
		
		System.out.print("My word choices for the loggers: ");
		
		for (String word : wordOptions) {
			System.out.print(word + ", ");
		}
		
		System.out.println("\n");
		
		for (String word : wordOptions) {
			spaced.log(word);
			System.out.println();
			spaced.error(word);
			System.out.println("\n");
		}
		
		System.out.println("Just proving to myself that there is not a space "
				+ "after the word.  ");
		spaced.log(wordOptions[0]);
		System.out.print("*\n\n");
		
		for (String word : wordOptions) {
			asterisk.log(word);
		}
		
		System.out.println();
		
		for (String word : wordOptions) {
			
			asterisk.error(word);
			System.out.println();
		}
	}

}
