package Exceptions.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionDemo {

	public static void main(String[] args) throws Exception {//throws exception is used when we dont know the error in the program
      Scanner sc = new Scanner(System.in);
		
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		
		
		if( n1 < 0 || n2 < 0)
			throw new Exception("Values cannot be negative....");
		else
			System.out.println((n1/n2));
			
	}

}
