package ro.ase.cts.observer;

public class SmsNotification implements NotificationInterface {

	@Override
	public void notifyUser(double amount) {
		System.out.println(" SMS notification "+ amount + "extracted");
		
	}

}
