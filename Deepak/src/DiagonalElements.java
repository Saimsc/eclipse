import java.util.Scanner;
public class DiagonalElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a [][]=new int[row][column];
		System.out.println("enter the input");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
			}
		System.out.println("diagonal elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
