package FileHandling.employee;

public class Employee {
	private String name , address , dept;

	public Employee() {
		
	}

	public Employee(String name, String address, String dept) {
		super();
		this.name = name;
		this.address = address;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", dept=" + dept + "]";
	}




}
