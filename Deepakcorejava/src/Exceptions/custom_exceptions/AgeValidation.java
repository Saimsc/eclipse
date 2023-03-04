package Exceptions.custom_exceptions;

import java.util.Scanner;
public class AgeValidation {

	public static void main(String[] args) throws AgeInvalidException {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		if(age <18)
			throw new AgeInvalidException("your age:"+age+" is not eligible for voting");
		else
			System.out.println("eligible for voting.........");
	     }

         }
