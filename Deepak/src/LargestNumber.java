import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int max=a[0];
		System.out.println("enter the input");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(max<a[i])
			{
			max=a[i];	
			}
		}
System.out.println("the max value is:"+max);
	}

}
