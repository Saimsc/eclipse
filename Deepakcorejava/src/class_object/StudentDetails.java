package class_object;

public class StudentDetails {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=401;
		s1.name="arun";
		s1.dept="ECE";
		s1.m1=75;
		s1.m2=78;
		s1.m3=74;
		Student s2=new Student();
		s2.id=402;
		s2.name="dinesh";
		s2.dept="EEE";
		s2.m1=87;
		s2.m2=84;
		s2.m3=81;
		Student s3=new Student();
		s3.id=403;
		s3.name="swathi";
		s3.dept="CSE";
		s3.m1=79;
		s3.m2=85;
		s3.m3=94;
		System.out.println("***student s1 details***");
		System.out.println(s1.toString());
		System.out.println("***student s2 details***");
		System.out.println(s2.toString());
		System.out.println("***student s3 details***");
		System.out.println(s3.toString());
	}

}
