package collectionsFramework;
import java.util.*;

public class MapsDemo {
    //key--.integer,value is string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> hash = new HashMap<Integer,String>();
 hash.put(45, "animals");
 hash.put(1, "fruits");
 hash.put(123, "weekdays");
 hash.put(2, "months");
 
 System.out.println("hashmap:"+hash);
 hash.put(2,"years");
 System.out.println(hash);
 hash.put(14,"fruits");
 System.out.println(hash);
 System.out.println("keys in hashmap:"+hash.keySet());
 System.out.println("values:"+hash.values());
 System.out.println("123 key available?:"+hash.containsKey(123));
 System.out.println("value'fruits' availability:"+hash.containsValue("fruits"));
 System.out.println("value of key 2:"+hash.get(2));
 hash.remove(14);
 System.out.println(hash);
 for(Map.Entry<Integer,String> entry : hash.entrySet()) {
	// System.out.println(entry);
 //System.out.println(entry.getValue());
 System.out.println(entry.getKey());

 }
	}

}
