package ro.ase.cts.seminar_10.Main;

import ro.ase.cts.seminar10.strategy.MarketingStategyInterface;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;

public class Main {
	
public static void main(String[] args) {
	
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
	
	}
}
