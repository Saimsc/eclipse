package FileHandling.employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import FileHandling.employee.Employee;

public class EmployeeDetails {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("EmployeeInfo"));
				
				String name = br.readLine();			// name = Name : Arun	
				String dept = br.readLine();
				String address = br.readLine();
				
				
//				System.out.println(name);
//				System.out.println(dept);
//				System.out.println(address);

				br.close();
				
				
				name = getSplited(name);			// name = Arun
				dept = getSplited(dept);			// dept = Admin
				address = getSplited(address);		// address = HYD
				
				Employee e1 = new Employee(name,dept,address);
				
				System.out.println(e1);
				
			}
			
			public static String getSplited(String s) {			// s =Address : HYD
				String[] str = s.split(":"); 					// str[0] = Address , str[1] = HYD 
			
					return str[1];						// Admin		// HYD
			}
				
				
}
