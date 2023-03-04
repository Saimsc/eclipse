package collections.list.product;
import java.util.ArrayList;
public class ProductDetails {

	public static void main(String[] args) {
		Product p1=new Product(562,"laptops",true);
		Product p2=new Product(471,"keyboard",true);
		Product p3=new Product(746,"mouse",false);
		ArrayList<Product> productList=new ArrayList<Product>();
productList.add(p1);
productList.add(p2);
productList.add(p3);
for(int i=0;i<productList.size();i++) {
	System.out.println(productList.get(i));
}
	for(Product p:productList) {
		if(p.isAvailable()==true)
			System.out.println(p);
	}

	
	}
}

