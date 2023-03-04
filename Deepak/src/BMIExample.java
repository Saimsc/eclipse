import java.util.Scanner;
public class BMIExample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	int height=sc.nextInt();
	int weight=sc.nextInt();
	System.out.println("the BMI value is:"+calculateBMI(height,weight));
	}
	public static double calculateBMI(int height,int weight)
	{
		double bmi=(double)weight/(height*height);
		return bmi;

	}

}
