package Interface.Maxbill;

public interface Bill {
  public double calcBill();
  public static WBill displayMaxBillInfo(WBill s1,WBill s2) {
	  if(s1.calcBill()>s2.calcBill()) {
		  return s1;
  }
	  else
		  return s2;
  }
}
