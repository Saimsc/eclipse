
public class Student2 {
int rollno;
String name;
	public static void main(String[] args) {
		Student2 s1=new Student2(101,"abhishek");
	}
	Student2(int x, String n){
		rollno= x;
		name= n;
    System.out.println("name:"+name+"rollno:"+rollno);

	}

}
