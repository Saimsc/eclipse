package abstraction.student;

public class School {
public static void main(String[] args) {
int[] m1= {78,75,76,63};
Class8 s8_1 = new Class8("john",m1);
System.out.println(s8_1.getId()+" "+s8_1.findPercentage());
System.out.println(s8_1);
int[] theory1= {98,94,96};
int[] practical1= {96,92,94};
Class11 s11_1 = new Class11("james",74,76,theory1,practical1);
System.out.println(s11_1);

}
	}

