package ro.ase.cts.seminar8;

import ro.acs.ase.seminar8.decorator.AbstractBackpack;
import ro.acs.ase.seminar8.decorator.Backpack;
import ro.acs.ase.seminar8.decorator.WithFoodDecorator;
import ro.acs.ase.seminar8.decorator.WithLaptopDecorator;
import ro.ase.cts.seminar8.composite.CatalogComponent;
import ro.ase.cts.seminar8.composite.Product;
import ro.ase.cts.seminar8.composite.ProductCatalog;
import ro.ase.cts.seminar8.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {
		//ctr+shift+o
		OrderFacade facade = new OrderFacade();
		facade.order();
		System.out.println("---------------------------------------------");
		CatalogComponent laptop = new Product("Asus",4510);
		CatalogComponent smartPhone = new Product("Samsung s20", 3500);

		CatalogComponent techProductsCatalog = new ProductCatalog("Tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartPhone);
		
		CatalogComponent officeProductCatalog = new ProductCatalog("Office products");
		CatalogComponent paperclip = new Product("Paperclip", 40);
		CatalogComponent pen = new Product("Red plen", 5);
		officeProductCatalog.add(pen);
		officeProductCatalog.add(paperclip);
		
		CatalogComponent genericProducts = new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic Product", 0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		System.out.println(genericProducts);
		
		System.out.println("--------------------");
		
		AbstractBackpack myBackpack = new Backpack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackpack = new WithLaptopDecorator(
				new WithFoodDecorator(myBackpack, "banana"));
		decoratedBackpack.pack();
	}
	
	
	

}
