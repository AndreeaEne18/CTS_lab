package ro.ase.cts.seminar_6.builder;

public class ProductFactory {
	
	public Product makeProduct(String type, String productName)  throws UnsupportedOperationException{
		if(type.equalsIgnoreCase("tech")) {
			return new TechProduct(productName);
		}else if(type.equalsIgnoreCase(productName)) {
			return new OfficeProduct();
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
