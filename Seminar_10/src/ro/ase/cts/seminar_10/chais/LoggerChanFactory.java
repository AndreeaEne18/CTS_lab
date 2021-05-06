package ro.ase.cts.seminar_10.chais;

public class LoggerChanFactory {

	public static AbstractLogger getChanOfLoggers() {
		AbstractLogger errLogger = new ErrorLogger(Verbosity.ERROR);
		AbstractLogger fileLogger = new FileLogger(Verbosity.DEBUG);
		AbstractLogger consLogger = new ConsoleLogger(Verbosity.INFO);
		
		errLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consLogger);
		
		return errLogger;
	}
}
