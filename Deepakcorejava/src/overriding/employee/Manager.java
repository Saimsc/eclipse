package overriding.employee;

public class Manager extends Employee{
private static int idgen=501;
public Manager() {
}

public Manager(int salary) {
	super(idgen++,salary);
}
public float calculateTransportAllowance() {
	float ta=((float)getSalary()*15)/100;
	return ta;
}
	public String toString() {
	return"ID:"+getId()+"salary:"+getSalary()+"transportAllowance:"+calculateTransportAllowance();
	
}
}
