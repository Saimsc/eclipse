package Interface.bill;

public class WBill implements Bill{
	private double amount;
	private int litres;
	public WBill()
	{
		
	}
public WBill(int litres)
{
	this.litres=litres;
}
public double calcBill()
{
	amount=litres*25;
	return amount;
}
public void displayBill() {
	System.out.println("bill:"+calcBill());
}
public String toString()
{
	String s="Litres:"+litres+"\n"+"Bill:"
+calcBill();
	return s;
}
}
