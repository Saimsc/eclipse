package Exceptions.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2;
		float div = -0.0f;
      try {
		n1 = sc.nextInt(); // 5
		n2 = sc.nextInt();	//	0

		
			div = n1 / n2; 								// 5/0==> exception occured
		} catch (ArithmeticException e) {
			// System.err.println("Exception occurred...");
			e.printStackTrace();
		}   catch (InputMismatchException i) { 
			i.printStackTrace();
			}
		finally {
			System.out.println("finally blocked...");
			System.out.println("result : " + div);
		}
		
		System.out.println("remaining code ....");

sc.close();
	}




	}


