package collectionsFrameworks.maps.sorting.demo;
import java.util.Comparator;
import java.util.Map;
public class ValueSort implements Comparator<Integer>{//here we take integer generic only because jvm doesnot take other data types

	private Map<Integer,Double> m1;
	
public ValueSort(Map<Integer,Double> m1) {
		this.m1=m1;
	
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		Double value1 = m1.get(o1);
		Double value2 = m1.get(o2);
		return Double.compare(value1,value2);
	}
}
