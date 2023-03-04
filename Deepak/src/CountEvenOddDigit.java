import java.util.Scanner;
public class CountEvenOddDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int digit=0;
int num=sc.nextInt();
int evendigit=0;
int odddigit=0;
while(num!=0)
{
	digit=num%10;
	if(digit%2==0)
	{
		evendigit++;
	}
	else
	{
		odddigit++;
	}
	num=num/10;
	System.out.println("the odd digit is:"+odddigit);
	System.out.println("the even digit is:"+evendigit);
	}
}
	}


