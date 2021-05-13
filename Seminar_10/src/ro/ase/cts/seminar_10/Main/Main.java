package ro.ase.cts.seminar_10.Main;

import ro.ase.cts.seminar10.command.CommandInterface;
import ro.ase.cts.seminar10.command.DimLightCommand;
import ro.ase.cts.seminar10.command.IncraseLightIntensityCommand;
import ro.ase.cts.seminar10.command.LightBulb;
import ro.ase.cts.seminar10.command.RemoteControll;
import ro.ase.cts.seminar10.command.TurnLightOnCommand;
import ro.ase.cts.seminar10.command.TurnOffLightCommand;
import ro.ase.cts.seminar10.strategy.MarketingStategyInterface;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;
import ro.ase.cts.seminar_10.chais.AbstractLogger;
import ro.ase.cts.seminar_10.chais.LoggerChanFactory;
import ro.ase.cts.seminar_10.chais.Verbosity;




public class Main {
	
public static void main(String[] args) {
	System.out.println("******************Strategy***************************************");

	ModulMarketing modulMarketing =new ModulMarketing();
	modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
	double puncteBonus= modulMarketing.getBonus(100);
	System.out.println("Numar pct bonu: " + puncteBonus);
	
	modulMarketing.setCurrentStrategy(new MarketingStategyInterface() {
		
		@Override
		public double calculateBonus(double base) {
			
			return  30* base;
		}
	});
	
	puncteBonus= modulMarketing.getBonus(100);
	System.out.println("Numar pct bonu: " + puncteBonus);
	
	modulMarketing.setCurrentStrategy((base) -> {return 20*base;}); 
	
	 puncteBonus= modulMarketing.getBonus(100);
	 System.out.println("Numar pct bonu: " + puncteBonus);
	 
	System.out.println("******************Chain of Responsibility***************************************");
	
	AbstractLogger loggerChain = LoggerChanFactory.getChanOfLoggers();
	loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
	loggerChain.logMessage(Verbosity.ERROR, "Something is wrong!");
	loggerChain.logMessage(Verbosity.DEBUG, "This is a debug message");
	
	System.out.println("*********************Command******************************************");
	
	LightBulb bulb= new LightBulb();
	
	CommandInterface lightOnCommand = new TurnLightOnCommand(bulb);
	CommandInterface lightOFf = new TurnOffLightCommand(bulb);
	CommandInterface dimLight = new DimLightCommand(bulb);
	CommandInterface increCommandInterface = new IncraseLightIntensityCommand(bulb);
	
	RemoteControll controll = new RemoteControll(lightOnCommand, lightOFf, dimLight, increCommandInterface);
	
	
	controll.pressLightOnButton();
	controll.pressDimButton();
	controll.pressIncreseButton();
	controll.pressIncreseButton();
	controll.pressDimButton();
	controll.pressLightOffButton();
	System.out.println("*********************end******************************************");

	}
}
