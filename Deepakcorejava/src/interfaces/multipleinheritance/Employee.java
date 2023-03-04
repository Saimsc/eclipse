package interfaces.multipleinheritance;

public class Employee extends Person implements AgeCalculation {
	private String dept;
	private int salary;
	public Employee() {
		
	}
	public Employee(String name,int yearsOfBirth,String dept,int salary) {
		super(name,yearsOfBirth);
		this.dept=dept;
		this.salary=salary;
	
}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	public int getAge() {
		int currentAge=2021-super.getYearsOfBirth();
		return currentAge;
	}
	public String toString() {
		return "Employee[name="+getName()+",dept="+dept+",salary="+salary+",age="+getAge()+"]";
	}
}
