package Exceptions.demo;
import java.util.*;
public class TryCatchDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		float div = -0.0f;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		try {
			div = n1/n2;
		}catch(ArithmeticException e) {
		System.err.println("exception occurred");
		}
		System.out.println("result:"+div);
}
}
