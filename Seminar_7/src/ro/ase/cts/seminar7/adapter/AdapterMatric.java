package ro.ase.cts.seminar7.adapter;

public class AdapterMatric implements MovableImperial {

	private EuropeanCar euroCar;
	private final double multiplaier = 0.62137;
	public AdapterMatric(EuropeanCar euroCar) {
		super();
		this.euroCar = euroCar;
	}

	@Override
	public int getMaxSpeed() {
		return kmToMiles();
	}
	
	private int kmToMiles() {
		return (int) (euroCar.getMaxSpeed() * multiplaier);
	}

}
