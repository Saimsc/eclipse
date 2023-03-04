package overriding.employee;

public class Mechanic extends Employee {
private static int idGen=201;
public Mechanic() {
	
}
public Mechanic(int salary) {
	super(idGen++,salary);
}
public String toString() {
	return"ID:"+getId()+"salary:"+getSalary()+",transportAllowance:"+calculateTransportAllowance();
	}
}

