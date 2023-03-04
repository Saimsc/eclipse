package comm;

public class Tyre {

	private String brand;
	
	
	// using constructor and property  we can call the brand

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
}
