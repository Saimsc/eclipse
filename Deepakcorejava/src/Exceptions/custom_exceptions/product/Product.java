package Exceptions.custom_exceptions.product;

public class Product {
	private int id;
	private int weight;
	private int price;
	private static int idgenerator=876;
	public Product() {
		id=idgenerator;
		idgenerator =idgenerator + 1;
		
	}
	public Product(int weight, int price) {
		this();
		this.weight = weight;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
	}

}
