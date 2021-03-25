package ro.ase.cts.seminar_5.refactory;

public class OfficeProduct implements Product{
	String productName;
	
	public OfficeProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		
		return "this is office product";
	}

}
