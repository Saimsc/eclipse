package collections.list;
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Character> l1=new LinkedList<Character>();
		System.out.println("size:");
		int size=sc.nextInt();
		System.out.println("enter"+size+"elements:");
		for(int i=0;i<size;i++) {
			char element =sc.next().charAt(0);
			l1.add(element);
		}
		System.out.println(l1);
		getVowels(l1);
	}
	public static void getVowels(LinkedList<Character> l) {
		LinkedList<Character> vowels=new LinkedList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		for(int i=0;i<l.size();i++) {
			char c=l.get(i);
			if(vowels.contains(Character.toLowerCase(c)))
				System.out.println(c);
		}
	}

}
