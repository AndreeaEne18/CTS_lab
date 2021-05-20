package ro.ase.cts.template;

public class DecimalFormatter extends AbstractFormatter{

	@Override
	public String formatInput(int input) {
		return String.format("%d", input);
	}

}
