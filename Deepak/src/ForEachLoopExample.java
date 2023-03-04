import java.util.Arrays;
import java.util.List;

public class ForEachLoopExample {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,4,5,561,5,5,3);
		
		/*
		 * for(int i=0;i<values.size();i++) { System.out.println(values.get(i)); }
		 */
	
		/*
		 * for(int i:values) { //variable name and method name as values
		 * System.out.println(i); }
		 */
	
		
		
		values.forEach(i->System.out.println(i));
		
	}
	
	
	

}
