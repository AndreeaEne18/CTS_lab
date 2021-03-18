package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {

	@Override
	public void senNotification(String message) {
		System.out.println("Sent Email notification with messager: " +message);
		
	}

}
