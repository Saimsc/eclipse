package collections.iterator;
import java.util.*;
public class Demo {
 public static void main(String[] args) {
	 List<Integer> l1 =new ArrayList<Integer>();
	 l1.add(56);
	 l1.add(789);
	 l1.add(123);
	 l1.add(1475);
	 Iterator<Integer> itr=l1.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
		 int element=itr.next();
		 if(element % 2 == 0)
			 itr.remove();  
	 }
	 System.out.println(l1);
	 Set<String> s1 = new HashSet<String>();
	 s1.add("ant");
	 s1.add("guva");
	 s1.add("Hello World");
	 s1.add("Jasmine");
	 Iterator<String> it = s1.iterator();
	 while(it.hasNext()) {
		 if(it.next().length()<8)
			 it.remove();
	 }
	 System.out.println(s1);
 }
}
