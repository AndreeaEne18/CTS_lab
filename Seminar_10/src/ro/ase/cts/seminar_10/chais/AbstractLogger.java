package ro.ase.cts.seminar_10.chais;

public abstract class AbstractLogger {
	
	protected Verbosity level;
	protected AbstractLogger nextLogger;

	public AbstractLogger(Verbosity level) {
		super();
		this.level = level;
		
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	 
	 public void logMessage(Verbosity level, String message) {
		 if(this.level.getVerbosity() <= level.getVerbosity()) {
			 write(message);
		 }
		 if(nextLogger !=  null) {
			 nextLogger.logMessage(level, message);
		 }
	 }
	 
	 abstract void write(String message) ;
}
