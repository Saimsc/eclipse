import java.util.Scanner;
public class VoteEligible {

	public static void main(String[] args) {
		System.out.println(checkVoteEligible());
	}
    public static String checkVoteEligible()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the age");
    	int age=sc.nextInt();
    	sc.close();
    	{
    		if(age<18)
    		{
    			return"not eligible to vote";
    		}
    		else
    		{
    			return"eligible to vote";
    		}
    }

	}
}

