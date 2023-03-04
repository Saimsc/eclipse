package collectionsFramework.maps;
import java.util.*;
public class OddOccurence {

	public static void main(String[] args) {
    int[] arr= {1,1,2,1,3,2,3,4,4,3,4,4,6};
    Map<Integer,Integer> occurence = new TreeMap<Integer,Integer>();
    for(int i=0;i<arr.length;i++) {
    	int arrElement = arr[i];//
    	if(occurence.containsKey(arrElement)) {
    		int value = occurence.get(arrElement);
    		value=value+1;//1+1=2        
    		occurence.put(arrElement,value);//occ.put(1,2)
    		
    	}else {
    		occurence.put(arrElement,1);
    	}
    }
System.out.println(occurence);
/*
	System.out.println("odd times occured elements:");
	for(Map.Entry<Integer,Integer> entry : occurence.entrySet()){//entry--->6=1
		if(entry.getValue() % 2 != 0)//if(1%2!=0) T
			System.out.println(entry.getKey());//6
			}
			}*/
	
   String oddoccured = "",uniqueElements ="";
   for(Map.Entry<Integer,Integer> entry : occurence.entrySet()) {
	   int count = entry.getValue();
	   //odd occurence
	   if(count % 2 != 0)
		   oddoccured= oddoccured+" "+entry.getKey();
	   //unique elements
	   if(count == 1)
		   uniqueElements = uniqueElements+" "+entry.getKey();
   }
   System.out.println("odd occured elements:"+oddoccured);
   System.out.println("unique elements:"+uniqueElements);
	}
}
