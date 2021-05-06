package ro.ase.cts.seminar_10.chais;

public abstract class AbstractLogger {
	
	protected Verbosity level;
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	 
	 public void logMessage(Verbosity level, String message) {
		 if(this.level.getVerbosity() <= level.getVerbosity()) {
			 
		 }
	 }
	 
	 abstract void write(String message) ;
}
