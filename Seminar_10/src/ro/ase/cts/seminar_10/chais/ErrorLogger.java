package ro.ase.cts.seminar_10.chais;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(Verbosity level) {
		super(level);
		
	}

	@Override
	void write(String message) {
		System.out.println(ErrorLogger.class.getName() + " : "+ message);
	}
	

}
