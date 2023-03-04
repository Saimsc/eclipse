package collectionsFrameworks.maps.sorting.demo;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
	Map<Integer,Double> m1 = new HashMap<Integer,Double>();//can use tree map also
	m1.put(23, 0.32);
	m1.put(123, 3.36);
	m1.put(14, 125.36);
	m1.put(3, 0.3);
	m1.put(1,15.3);
	m1.put(4, 15.3);
	
	System.out.println(m1);
	
//key Descending
	KeyDescendingOrder KeySort = new KeyDescendingOrder();
	Map<Integer,Double> m2 = new TreeMap<Integer,Double>(KeySort);
	m2.putAll(m1);
	System.out.println("\nkey descending order:");
	System.out.println(m2);
	
	//value sort
	ValueSort v= new ValueSort(m1);
	Map<Integer,Double> m3 = new TreeMap<Integer,Double>(v);
	m3.putAll(m1);
	System.out.println("\nValue sorting:");
	System.out.println(m3);
	}

}
