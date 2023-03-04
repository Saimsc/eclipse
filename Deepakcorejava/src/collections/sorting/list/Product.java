package collections.sorting.list;

public class Product implements Comparable<Product> {
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
/* @Override
 public int compareTo(Product o) {
	 if(o.isAvailable())
		 return 1;
	 else if(!o.isAvailable())
		 return -1;
	 return 0;*/
/*@Override
public int compareTo(Product o) {
	return -Integer.compare(code,o.getCode());//"-" indicates for descending order of names 
}*/
@Override
public int compareTo(Product o) {
	return -name.compareToIgnoreCase(o.getName());//"-" indicates for descending order of names 
}
}




