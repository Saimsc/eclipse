import java.util.Scanner;
public class Ascending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the inputs");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		System.out.println("ascending order are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
				}
			}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}

	}

}
