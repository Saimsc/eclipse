package Interface.bill;

public class EBill {
 private double amount;
 private int units;
 public EBill()
 {
	 
 }
 public EBill(int units) {
	 this.units=units;
 }
 public double calcBill()
 {
	 amount=units*7;
	 return amount;
 }
 public void displayBill()
 {
	 System.out.println("bill:"+calcBill());
 }

public String toString() {
	String s= "units:"+ units + "\n"+"bill:" + calcBill();
	return s;
}
 
 }

