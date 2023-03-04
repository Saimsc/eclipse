package overriding.employee;

public class Employee {
private int id;
private int salary;
public Employee() {
	
}
public Employee(int id,int salary) {
	this.id=id;
	this.salary=salary;
}
public int getId() {
	return id;
}
public int getSalary() {
	return salary;
}
 public float calculateTransportAllowance() {
	 float ta=((float)salary*7)/100;
	 return ta;
 }

}
