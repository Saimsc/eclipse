package overriding.employee;

public class MainClass {
public static void main(String[] args) {
	Manager m1=new Manager(35000);
	System.out.println(m1);
	Trainee t1=new Trainee(25000);
	System.out.println(t1);
	Mechanic me1= new Mechanic(15000);
	System.out.println(me1);
}
}
