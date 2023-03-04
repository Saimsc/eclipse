package collections.cabcustomer;
import java.util.*;

class CabCustomerService {

	private List<CabCustomer> customerList=new ArrayList<CabCustomer>();
	public void addCabCustomer(CabCustomer c) {
		customerList.add(c);
	}
	public boolean isFirstCustomer(CabCustomer c) {
		for(CabCustomer cust:customerList) {
			if(cust.getPhone()==c.getPhone())
				return false;
		}
		return true;
	}
	public double calculateBill(CabCustomer c) {
		if(isFirstCustomer(c)) {
			return 0.0;
		}
		else if(c.getDistance()<=4)
			return 80.0;
		else
		{
			return 80+(c.getDistance()-4)*6;
					
		}
	}
	public String printBill(CabCustomer c) {
		return c.getCustomerName() +"please pay your bill of RS."+calculateBill(c);
	}
}
