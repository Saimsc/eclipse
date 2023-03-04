package collections_maps;
import java.util.HashMap;
import java.util.Map;
public class MapsDemo {

	public static void main(String[] args) {
	Map<Character,String> list	=new HashMap<Character,String>();
	list.put('a', "apple");
	list.put('b', "cat");
	list.put('c', "Egg");
	list.put('e', "Mouse");
	list.put('f',"Apple");
	char [] s = {'a','e','i','o','u'}; for(int i=0;i<s.length;i++) {
		if(list.containsKey(s[i])) {
			System.out.println(s[i]+ " "+list.get(s[i]));
		}
	}
	
	}

}
