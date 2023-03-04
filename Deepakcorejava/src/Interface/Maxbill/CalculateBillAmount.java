package Interface.Maxbill;

public class CalculateBillAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WBill w1=new WBill(500,2);
	WBill w2=new WBill(560,2);
	WBill w3=new WBill(1000,2);
	WBill w4=new WBill(456,2);
	WBill w5=new WBill(560,2.36f);

	System.out.println(w1);
	System.out.println(w2);
	System.out.println(w3);
	System.out.println(w4);
	System.out.println(w5);
	System.out.println("=========");
	
WBill w=Bill.displayMaxBillInfo(w1, w2);
w=Bill.displayMaxBillInfo(w, w3);
w=Bill.displayMaxBillInfo(w, w4);
w=Bill.displayMaxBillInfo(w, w5);

System.out.println(w);
}
}