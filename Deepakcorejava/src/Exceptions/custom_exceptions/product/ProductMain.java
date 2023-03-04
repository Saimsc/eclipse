package Exceptions.custom_exceptions.product;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import Exceptions.custom_exceptions.product.InvalidProductException;
import Exceptions.custom_exceptions.product.Product;

public class ProductMain{


	public static void main(String[] args) {
		Product p1 = new Product(199 ,2000);
		Product p2 = new Product(250,15000);
		Product p3 = new Product(18,700);
		Product p4 = new Product(580,2500);
		Product p5 = new Product(950,3000);
		Product p6 = new Product(650,240);
		Product p7 = new Product(200,2000);
		Product p8 = new Product(1000,20000);
		Product p9 = new Product(150,280);
		Product p10 = new Product(800,2080);
		
		Map<Integer,Product> Plist = new LinkedHashMap<Integer,Product>();
		Plist.put(p1.getId(), p1);
		Plist.put(p2.getId(), p2);
		Plist.put(p3.getId(), p3);
		Plist.put(p4.getId(), p4);
		Plist.put(p5.getId(), p5);
		Plist.put(p6.getId(), p6);		
		Plist.put(p7.getId(), p7);
		Plist.put(p8.getId(), p8);
		Plist.put(p9.getId(), p9);
		Plist.put(p10.getId(), p10);
		  displaymap(Plist);
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter the weight :");
		  float weight = sc.nextFloat();
		
		
	  Iterator<Map.Entry<Integer,Product>> ite = Plist.entrySet().iterator();
	  
	  while(ite.hasNext())
	  {
		  Map.Entry<Integer,Product> entry = ite.next();
		  
	      Product p = entry.getValue();
	      try {
	    	  if(p.getWeight()<200)
	    		  throw new InvalidProductException();
	      }
	     catch(InvalidProductException o)
	      {
	    	  ite.remove();
	      }
	  }
	  
	  displaymap(Plist);
	}
	public static void displaymap(	Map<Integer,Product> Plist)
	{
		
		  Iterator<Map.Entry<Integer,Product>> ite = Plist.entrySet().iterator();
		  
		  while(ite.hasNext())
		  {
			  Map.Entry<Integer,Product> entry = ite.next();
			  
			System.out.println(entry);
		  }
		  System.out.println("******************");
	

}
}
