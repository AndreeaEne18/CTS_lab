package ro.ase.cts.observer;

import javax.naming.InsufficientResourcesException;

public interface Withdrawable {
	public abstract void withdraw(double amount) throws InsufficientResourcesException;
}
