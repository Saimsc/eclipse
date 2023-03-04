package collections.list;
import java.util.Scanner;
import java.util.ArrayList;
public class EvenElements {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("size:");
		int size=sc.nextInt();
		System.out.println("enter"+size+"elements:");
		for(int i=0;i<size;i++) {
			int element=sc.nextInt();
			a1.add(element);
		}
		System.out.println(a1);
		for(int i=0;i<size;i++) {
			int element=a1.get(i);
			if(element%2==0)
				System.out.println(element);
			
		}

	}

}
