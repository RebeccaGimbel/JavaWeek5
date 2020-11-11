
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		printEachLetter(log);
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		printEachLetter(error);	
	}
	
	private void printEachLetter(String word) {
		int num = word.length();
		int numCheck = 0;
		for (char letter : word.toCharArray()) {
			System.out.print(letter);
			numCheck++;
			if(num != numCheck)
				System.out.print(" ");
		}		
	}
}
