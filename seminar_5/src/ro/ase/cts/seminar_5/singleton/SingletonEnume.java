package ro.ase.cts.seminar_5.singleton;

import java.util.ArrayList;

public enum SingletonEnume {
	INSTANCE;
	
	public ArrayList<String> products;
	
	public ArrayList<String> getProducts(){
		if(products==null) {
			products= new ArrayList<String>();
		}
		return products;
	}
}
