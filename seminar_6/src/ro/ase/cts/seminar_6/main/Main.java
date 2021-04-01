package ro.ase.cts.seminar_6.main;

import java.util.Scanner;

import ro.ase.cts.seminar_6.builder.AbstractProductFactory;
import ro.ase.cts.seminar_6.builder.Product;
import ro.ase.cts.seminar_6.builder.TechProductFactory;
import ro.ase.cts.seminar_6.singleton.Cart;



public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Selectati categoria de produse:\n tech - Produse \n office  - Produse office: ");
		String userPreference = scan.nextLine();
		Product myProduct=null;
		
		AbstractProductFactory productFactory= null;
		if(userPreference!=null) {
			if(userPreference.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
		}
		
		System.out.println(productFactory.getCatalog());
		userPreference = scan.nextLine();
		try {
			int selectedId = Integer.valueOf(userPreference);
			myProduct =  productFactory.makeProduct(selectedId);
		} catch (NumberFormatException e) {
			System.err.println("selectie invalida");
		}
		
		
		if(myProduct!=null) {
			myShoppingCart.products.add(myProduct);
		}
		for(Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}

	}

}
