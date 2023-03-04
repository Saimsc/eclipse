import java.util.Scanner;
public class LeapExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if(checkYear(year)) 
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		}
	public static boolean checkYear(int year)
	{
		return(year%4==0);
	}

}
