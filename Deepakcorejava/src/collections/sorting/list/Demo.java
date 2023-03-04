package collections.sorting.list;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(235);
		l1.add(26);
		l1.add(125);
		l1.add(43);
		l1.add(1);
		l1.add(0);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
	}
}
