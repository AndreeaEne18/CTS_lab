package ro.ase.cts.seminar_5.refactory;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct(String productName) throws UnsupportedOperationException {
		
		return new TechProduct(productName);
	}

	@Override
	public String getCatalog() {
		return "generic- Generic tech product";
	}

	

}
