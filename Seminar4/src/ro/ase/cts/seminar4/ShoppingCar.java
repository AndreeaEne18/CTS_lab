package ro.ase.cts.seminar4;

public class ShoppingCar {
	
	private static ShoppingCar instance = null;
	
	private ShoppingCar() {}

	public static ShoppingCar getInstance() {
		if(instance == null) {
		 instance = new ShoppingCar();
		 }
		 return instance;
	}
	
}
