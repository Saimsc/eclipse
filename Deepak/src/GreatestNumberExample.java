import java.util.Scanner;
public class GreatestNumberExample {

	public static void main(String[] args) {
		calculateGreatestExample();
	}
	public static void calculateGreatestExample()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=a;
		if(max<b)
		{
			max=b;
		}
		if(max<c)
		{
			max=c;
		}
System.out.println("the max value is:"+max);
	}

}
