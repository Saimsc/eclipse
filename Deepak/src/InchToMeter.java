import java.util.Scanner;
public class InchToMeter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the inch");
double inch=sc.nextDouble();
System.out.println("meter is:"+calculateMeter(inch));
	}
	public static double calculateMeter(double inch)
	{
	double meter=inch*0.025;
	return meter;
	}

}
