package Instance;

import java.util.Scanner;

public class FactorexampleSum{
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	int num=sc.nextInt();
	int start=1;
	int sum=0;
	while(start<=sum)
	{
		if(num%start==0)
		{
			sum=sum+start;
		}
		start++;
	}
System.out.println(sum);
}


}