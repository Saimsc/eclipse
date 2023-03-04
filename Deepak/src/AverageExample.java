import java.util.Scanner;
public class AverageExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the input");
		int sum=0;
		double average=0.0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			average=(double)sum/a.length;
		}
		System.out.println("the average is:"+average);
	}

}
