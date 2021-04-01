package ro.ase.cts.seminar_5.refactory;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		
		return new TechProduct("generci");
	}

	@Override
	public String getCatalog() {
		return "generic- Generic tech product";
	}

	

}
