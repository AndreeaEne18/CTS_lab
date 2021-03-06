package ro.ase.cts.seminar_5.main;

import java.util.Scanner;

import ro.ase.cts.seminar_5.refactory.AbstractProductFactory;
import ro.ase.cts.seminar_5.refactory.OfficeProduct;
import ro.ase.cts.seminar_5.refactory.Product;
import ro.ase.cts.seminar_5.refactory.ProductFactory;
import ro.ase.cts.seminar_5.refactory.TechProduct;
import ro.ase.cts.seminar_5.refactory.TechProductFactory;
import ro.ase.cts.seminar_5.singleton.Cart;

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
		
		myProduct =  productFactory.makeProduct();
//		}else {
//			System.out.println("Opriune invalida");
//			System.out.println("Catalog produse:\n tech - Produse \n office  - Produse office: ");
//		}
		if(myProduct!=null) {
			myShoppingCart.products.add(myProduct);
		}
		for(Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}

	}

}
