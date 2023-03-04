package FileHandling.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import FileHandling.employee.Employee;

public class Employee_book {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Book1.csv"));
		
		String columnNames = br.readLine();
		
		System.out.println(columnNames);

		String row = br.readLine();
		
		while(row != null) {
			createEmployee(row);
			row = br.readLine();
			
		}
		
	}
	
	public static void createEmployee(String s)
	{
		String[] str = s.split(" ,");
		
		Employee e= new Employee(str[0] , str[1], str[2]);
		System.out.println(e);
	}
}
