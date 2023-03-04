package collections.set.demo;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Demo {
// set-->doesnot allow duplicate values,no index concept
	public static void main(String[] args) {
		//unordered data
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(582);
		hset.add(12);
		hset.add(321);
		hset.add(12);
		hset.add(-63);
	System.out.println("hashset:"+hset);
	//sorted order by default ascending order
   TreeSet<Integer> tset=new TreeSet<Integer>();
   tset.addAll(hset);
   System.out.println("treeset:"+tset);
		//insertion order,ordered data
   LinkedHashSet<Integer> lset=new LinkedHashSet<>();
   lset.add(582);
   lset.add(12);
   lset.add(321);
   lset.add(12);
   lset.add(-63);
  
   System.out.println("linkedhashset:"+lset);
   //for each
   for(Integer value:lset) {
	   System.out.println(value);
   }
	}

}
