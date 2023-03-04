import java.util.Scanner;
public class DiagonalElementsUsingMethod {

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
     DiagonalElements(a);
	}
     public static void DiagonalElements(int a[][])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		for(int j=0;j<a.length;j++)
    		{
    			if(i==j)
    			{
    				System.out.print(a[i][j]);
    			}
    			else
    			{
    				System.out.print(" ");
    			}
    	 }
	System.out.println();
     }
	}

}
