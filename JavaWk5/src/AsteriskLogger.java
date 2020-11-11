
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		//System.out.println("***" + log +"***");	
		System.out.printf("****%s***\n", log);		
	}

	@Override
	public void error(String error) {
		printLineOfStars(error);
		System.out.println();
		System.out.println("***Error: " + error + "***");
		printLineOfStars(error);
		System.out.println();
	}
	private void printLineOfStars(String word) {
		    int times = (word.length())+13;
			for (int x = 0; x < times; x++) {
				System.out.print("*");
			}
			
	}
}
