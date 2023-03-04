import java.util.Scanner;
public class SumOfCubeArray 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size =sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the input0");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		}
      System.out.println("the sum of cube is:"+calculateCube(arr));
	}
	public static int calculateCube(int[]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+(a[i]*a[i]*a[i]);
		}
		return sum;
	}

}

