package collections.cabcustomer;

public class CabCustomer {
private int custId;
private String customerName,pickupLocation,dropLocation;
private int distance;
private long phone;
public CabCustomer() {
	
}
public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
		long phone) {
	this.custId = custId;
	this.customerName = customerName;
	this.pickupLocation = pickupLocation;
	this.dropLocation = dropLocation;
	this.distance = distance;
	this.phone = phone;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPickupLocation() {
	return pickupLocation;
}
public void setPickupLocation(String pickupLocation) {
	this.pickupLocation = pickupLocation;
}
public String getDropLocation() {
	return dropLocation;
}
public void setDropLocation(String dropLocation) {
	this.dropLocation = dropLocation;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
			+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
}

}
