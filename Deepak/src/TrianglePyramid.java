import java.util.Scanner;
public class TrianglePyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
for(int row=1;row<=number;row++)
{
for(int space=1;space<=number-row;space++)
{
	System.out.print(" ");
}
for(int col=1;col<=row;col++)
{
System.out.print("* ");	
}
System.out.println();
}
}

}
