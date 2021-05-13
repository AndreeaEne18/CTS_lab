package ro.ase.cts.seminar10.command;

public class RemoteControll {
	CommandInterface lightOnCommand;
	CommandInterface lightOfCommandl;
	CommandInterface dimLightCommand;
	CommandInterface increaseLightCommand;
	
	public RemoteControll(CommandInterface lightOnCommand, CommandInterface lightOfCommandl,
			CommandInterface dimLightCommand, CommandInterface increaseLightCommand) {
		super();
		this.lightOnCommand = lightOnCommand;
		this.lightOfCommandl = lightOfCommandl;
		this.dimLightCommand = dimLightCommand;
		this.increaseLightCommand = increaseLightCommand;
	}

	public void setLightOnCommand(CommandInterface lightOnCommand) {
		this.lightOnCommand = lightOnCommand;
	}

	public void setLightOfCommandl(CommandInterface lightOfCommandl) {
		this.lightOfCommandl = lightOfCommandl;
	}

	public void setDimLightCommand(CommandInterface dimLightCommand) {
		this.dimLightCommand = dimLightCommand;
	}

	public void setIncreaseLightCommand(CommandInterface increaseLightCommand) {
		this.increaseLightCommand = increaseLightCommand;
	}
	
	public void pressLightOnButton() {
		lightOnCommand.execute();
	}
	
	public void pressLightOffButton() {
		lightOfCommandl.execute();
	}
	
	public void pressIncreseButton() {
		increaseLightCommand.execute();
	}
	
	public void pressDimButton() {
		dimLightCommand.execute();
	}
}
