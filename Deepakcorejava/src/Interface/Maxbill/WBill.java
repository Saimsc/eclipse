package Interface.Maxbill;

public class WBill implements Bill{
	private float litresConsumed,costPerUnit;
	public WBill() {
		
	}
	public WBill(float litresConsumed,float costPerUnit) {
		this.litresConsumed=litresConsumed;
		this.costPerUnit=costPerUnit;
	}
public double calcBill() {
	return litresConsumed*costPerUnit;
}
@Override
public String toString() {
	return "WBill[litresConsumed="+litresConsumed+",costPerUnit="+costPerUnit+",Bill generated="+calcBill()+"]";
}
}
