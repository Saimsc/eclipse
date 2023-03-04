package overriding.employee;

public class Trainee extends Employee {
public static int idGen=401;
public Trainee() {
	
}
public Trainee(int salary) {
	super(idGen++,salary);
}
public String toString() {
	return"ID:"+getId()+"salary:"+getSalary()+"transportAllowance:"+calculateTransportAllowance();
}
}
