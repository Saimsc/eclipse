import java.util.Scanner;
public class SingleArrayUsingMethod {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("enter the input");
    for(int i=0;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    }
    single(a);
	}
	public static void single(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println("the index"+":="+a[i]);
    }
	}

}
