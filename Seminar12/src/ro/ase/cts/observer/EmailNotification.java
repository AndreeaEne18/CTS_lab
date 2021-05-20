package ro.ase.cts.observer;

public class EmailNotification implements NotificationInterface {

	@Override
	public void notifyUser(double amount) {
		System.out.println(" Email notification "+ amount + "extracted");
		
	}

}
