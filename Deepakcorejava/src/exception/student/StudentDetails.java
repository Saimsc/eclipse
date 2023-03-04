package exception.student;
import java.util.*;
public class StudentDetails {

	public static void main(String[] args) throws StudentNotFoundException {
		Student s1 = new Student("vishal","HYD");
		Student s2 = new Student("nandu","WRL");
		Student s3 = new Student("Rohan","SEC");
		Student s4 = new Student("swathi","HYD");
		Student s5 = new Student("reshma","SEC");
		
		Map<Integer,Student> studentMap = new LinkedHashMap<Integer,Student>();//here generics is student taken from object class
		studentMap.put(s1.getId(),s1);
		studentMap.put(s2.getId(),s2);
		studentMap.put(s3.getId(),s3);
		studentMap.put(s4.getId(),s4);
		studentMap.put(s5.getId(),s5);
		
		for(Map.Entry<Integer,Student> e : studentMap.entrySet()) {
			System.out.println(e);
		}
		System.out.println("===========================================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID of a student to be searched:");
		int search_id = sc.nextInt();
		if(studentMap.containsKey(search_id))
			System.out.println(studentMap.get(search_id));
		else
			throw new StudentNotFoundException("details of the student ID:"+search_id+"not found...");
	}

}
