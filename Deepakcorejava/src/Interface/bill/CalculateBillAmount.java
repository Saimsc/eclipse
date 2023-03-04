package Interface.bill;
import java.util.Scanner;
public class CalculateBillAmount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter yor choice:");
		System.out.println("1.water bill"+"\n"+"2.electric bill");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:WBill w=new WBill(23);
		       System.out.println(w);
		       break;
		case 2:EBill e=new EBill(34);
	           System.out.println(e);
	           break;
	           default:System.out.println("invalid option");
		}
		sc.close();
	}

}
