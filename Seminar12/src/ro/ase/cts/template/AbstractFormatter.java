package ro.ase.cts.template;

public abstract class AbstractFormatter {
	//template method
	public void displayOutput(int input) {
		int userInput = getInput(input);
		String formattedInput = formatInput(userInput);
		display(formattedInput);
	}
	
	protected int getInput(int fakeInput) {
		System.out.println("Getting input from user!");
		return fakeInput;
	}
	
	public abstract String formatInput(int input) ;
	
	protected void display(String input) {
		System.out.println(input);
	}
}
