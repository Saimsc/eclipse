import java.util.Scanner;
public class LeapYearUsingNestedIf {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the year");
     int year =sc.nextInt();
     if(year%4==0)
     {
    	 if(year%100==0)
    	 {
    		 if(year%400==0)
    		 {
    			 System.out.println("it is aleap year");
    		 }
    	
    
     else
     {
    	 System.out.println("century  year");
	}
    	 }
    	 else
	{
		System.out.println("it is aleap year");
	}
     }
     else
{
	System.out.println("not a leap year");
}
}
}