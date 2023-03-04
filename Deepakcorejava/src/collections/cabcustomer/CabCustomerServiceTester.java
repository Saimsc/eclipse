package collections.cabcustomer;

public class CabCustomerServiceTester {
public static void main(String[] args) {
	CabCustomer c1=new CabCustomer(101,"vishal","JNTU","Gachibouli",10,9632587410L);
	CabCustomer c2=new CabCustomer(102,"abdul","Yjunction","Gachibouli",18,8832587410L);
	CabCustomer c3=new CabCustomer(103,"Arun","Miyapur","Gachibouli",12,7432587410L);
	CabCustomer c4=new CabCustomer(104,"john","Ameerpet","KPHP",6,8532587410L);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	
	System.out.println("=======================================================================");
	CabCustomerService service=new CabCustomerService();
	service.addCabCustomer(c1);
	service.addCabCustomer(c3);
	
	System.out.println(service.printBill(c1));
	System.out.println(service.printBill(c4));
	
	c4.setPickupLocation("JNTU");
	c4.setDropLocation("ameerpet");
	c4.setDistance(8);
	System.out.println(service.printBill(c4));
	
	
	
	
}
}
