package ro.ase.cts.seminar_6.builder;

public class TechProduct implements Product, Cloneable{
	int id;
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
		
	private  TechProduct( ) {

	}
	
	private  TechProduct(int id) {
		super();
		this.id= id;
	}
	@Override
	public String getDescription() {
		return this.productName+" "+" "+this.manufacturer+" " +this.model;
	}
	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public float getPrice() {
		return price;
	}
	
	public static class TechProductBilder{
		private TechProduct product;
		
		public TechProductBilder (int id) {
			product = new TechProduct(id);
		}
		
		public TechProductBilder setName(String name) {
			product.productName = name;
			return this;
		}
		public TechProductBilder setManufacturer(String manufacturer) {
			product.manufacturer = manufacturer;
			return this;
		}
		
		public TechProductBilder setModel(String model) {
			product.model =  model;
			return this;
		}
		
		public TechProductBilder setDisplayType(String displayType) {
			product.displayType =  displayType;
			return this;
		}
		public TechProductBilder setPrice(float price) {
			product.price =  price;
			return this;
		}
		
		public TechProduct getProduct() {
			return product;
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		TechProduct newProduct = new TechProductBilder(this.id)
				.setDisplayType(this.displayType)
				.setManufacturer(this.manufacturer)
				.setModel(this.model)
				.setName(this.productName)
				.setPrice(this.price)
				.getProduct();
			
		return newProduct;
	}
	
	

}
