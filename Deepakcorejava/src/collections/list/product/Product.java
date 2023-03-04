package collections.list.product;

public class Product {
private int code;
private String name;
private boolean isAvailable;
public Product() {
	
}
public Product(int code, String name, boolean isAvailable) {
	
	this.code = code;
	this.name = name;
	this.isAvailable = isAvailable;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isAvailable() {
	return isAvailable;
}
public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}
@Override
public String toString() {
	return "Product [code=" + code + ", name=" + name + ", isAvailable=" + isAvailable + "]";
}

}
