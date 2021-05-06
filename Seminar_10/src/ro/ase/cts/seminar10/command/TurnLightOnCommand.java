package ro.ase.cts.seminar10.command;

public class TurnLightOnCommand implements CommandInterface {
	
	private LightBulb buld;
	
	public TurnLightOnCommand(LightBulb buld) {
		super();
		this.buld = buld;
	}


	@Override
	public void execute() {
		buld.turnOnLight();
	}
	

}
