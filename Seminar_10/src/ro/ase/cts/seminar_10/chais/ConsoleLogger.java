package ro.ase.cts.seminar_10.chais;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(Verbosity level) {
		super(level);
		
	}

	@Override
	void write(String message) {
		System.out.println(ConsoleLogger.class.getName() + " : " + message);
	}

}
