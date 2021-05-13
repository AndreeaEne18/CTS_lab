package ro.ase.cts.seminar10.command;

public class IncraseLightIntensityCommand implements CommandInterface{
	
	private LightBulb lightBulb;
	
	public IncraseLightIntensityCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		lightBulb.increaseLightIntensity();
		
	}

}
