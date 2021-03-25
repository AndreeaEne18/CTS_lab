package ro.ase.cts.seminar4;

import ro.ase.cts.seminar_5.singleton.Cart;
import ro.ase.cts.seminar_5.singleton.EagerSchoppingCarExample;
import ro.ase.cts.seminar_5.singleton.SingletonEnume;

public class Main {

	public static void main(String[] args) {
		Cart shoppCart = Cart.getInstance("shoppingCart");
		Cart wishList= Cart.getInstance("wishList");
		Cart wishList2= Cart.getInstance("wishList");
		
		shoppCart.getProducts();
		wishList.getProducts();
		
		
		
		EagerSchoppingCarExample example = EagerSchoppingCarExample.INSTANCE;
		EagerSchoppingCarExample example2 = EagerSchoppingCarExample.INSTANCE;
		
		if (example==example2) {
			System.out.println("obiectele sunt identice");
		}
		
		SingletonEnume mySingletonEnume = SingletonEnume.INSTANCE;
		mySingletonEnume.getProducts();
	}

}
