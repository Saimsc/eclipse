import java.util.Scanner;
public class FactorexampleSum{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int start=1;
	while(start<=num)
	{
		if(num%start==0)
		{
			System.out.println(start);
		}
		start++;
	}
	
}
}