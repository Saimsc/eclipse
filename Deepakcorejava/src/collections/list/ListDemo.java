package collections.list;
import java.util.ArrayList;
import java .util.LinkedList;
public class ListDemo {

	public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(45);
	a1.add(89);
	a1.add(23);
	a1.add(56);
	a1.add(12);
System.out.println(a1);
System.out.println("search 23:"+a1.contains(23));
System.out.println("element in index 3:"+a1.get(3));
a1.add(2,178);
System.out.println(a1);
System.out.println("index of 12:"+a1.indexOf(12));
a1.add(89);
System.out.println(a1);
System.out.println("index of 89:" +a1.indexOf(89));
System.out.println("last occurence:"+a1.lastIndexOf(89));
LinkedList<Integer> a2 = new LinkedList<Integer>();	
a2.add(301);
a2.add(325);
a2.add(369);
System.out.println("======a2 collection=====");
	System.out.println("a2");
	a2.addAll(a1);
	System.out.println(a2);
	a2.set(4,456);//replacing element
	System.out.println(a2);
	a2.remove(2);//remove an element in index 2
	System.out.println(a2);
	System.out.println(a2.hashCode());
	}

}
