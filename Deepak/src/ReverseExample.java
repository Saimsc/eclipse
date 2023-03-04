import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int digit;
		int rev=0;
		int original=num;
		while(num!=0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
			
		}
		System.out.println("the reverse number is:"+rev);
	}

}
