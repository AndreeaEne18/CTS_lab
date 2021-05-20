package ro.ase.cts.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.InsufficientResourcesException;

import ro.ase.cts.memento.CharacterMemento;
import ro.ase.cts.memento.GameCharacter;
import ro.ase.cts.observer.CreditAccount;
import ro.ase.cts.observer.NotificationInterface;
import ro.ase.cts.observer.SmsNotification;
import ro.ase.cts.template.HexFormatter;

public class Main {

	public static void main(String[] args) {
		CreditAccount account = new CreditAccount(1000, "IBANN");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double amount) {
				System.out.println("Inline example]: "+ amount + "extracted");
				
			}
		});
		NotificationInterface smsNotificationService = new SmsNotification();
		account.addObserver(smsNotificationService);
		try {
			account.withdraw(100);
			account.removeObserver(smsNotificationService);
			account.withdraw(100);
		} catch (InsufficientResourcesException e) {
			
			e.printStackTrace();
		}
		System.out.println("--------------------------------------------------");
	ArrayList<CharacterMemento> savelist= new ArrayList<CharacterMemento>();
	GameCharacter myCharacter = new GameCharacter("Andreea", 50);
	savelist.add(myCharacter.generateMemento());
	System.out.println("Character hitpoints" + myCharacter.getHitpoints());
	myCharacter.setMemento(savelist.get(0));
	System.out.println("Character hitpoints"+ myCharacter.getHitpoints());
	
	System.out.println("---------------------------------------------------");
	DecimalFormat decimalFormat = new DecimalFormat();
	
	HexFormatter formatter = new HexFormatter();
	formatter.displayOutput(10);
	}
}
