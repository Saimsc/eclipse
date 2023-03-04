package comm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("drive.xml");
	
		
	    Vehicle obj =(Vehicle)context.getBean("vehicle");
	   obj.drive();
	}

}
