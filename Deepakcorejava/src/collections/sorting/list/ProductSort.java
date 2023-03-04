package collections.sorting.list;

import java.util.*;

public class ProductSort {

	public static void main(String[] args) {
		List<Product> plist = new ArrayList<Product>();
		plist.add(new Product(562,"laptops",true));
		plist.add(new Product(563,"mouse",false));
		plist.add(new Product(564,"keyboard",true));
		plist.add(new Product(565,"chair",false));
		plist.add(new Product(566,"watch",true));
		
		display(plist);
		Collections.sort(plist);
		display(plist);
	}
	public static void display(List<Product> plist) {
		for(Product p:plist) {
			System.out.println(p);
		}
		System.out.println("===========================");

	}

}
