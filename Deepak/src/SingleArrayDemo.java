import java.util.Scanner;
public class SingleArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("input");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
	
		}
	for(int i=0;i<size;i++)
	{
		System.out.println("the index"+i+""+"is"+"=5"+a[i]);
	}

	}

}
