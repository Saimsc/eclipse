import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int number=sc.nextInt();
		int sum=0;
		int start=1;
		while(start<=number)
		{
			sum=sum+start;
			start++;
		}
		System.out.println("the sum is:"+sum);
	}
}
