import java.util.Scanner;
public class RowSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int [row][column];
		System.out.println("enter the input");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				a [i][j]=sc.nextInt();
			}
			}
		System.out.println("row sum ans:");
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<column;j++)
			{
			sum=sum+a[i][j];
			System.out.print(a[i][j]+" ");
			}
			System.out.print(sum);
			System.out.println();
			}
			}

	}


