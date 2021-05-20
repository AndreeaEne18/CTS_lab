package ro.ase.cts.observer;

import java.util.ArrayList;

import javax.naming.InsufficientResourcesException;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable {
	
//entitate Observabil concrent 
	
	public CreditAccount(double balance, String iban) {
		super(balance, iban);
	}
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientResourcesException {
		
		//metoda care are rol de a notifica observatorii
		
		if(amount>0) {
			this.balance -= amount;
		}
		
		for(NotificationInterface observer : this.observers) {
			observer.notifyUser(amount);
		}
	}

	

}
