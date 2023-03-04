package comm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TYreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("drive.xml");
		
		Tyre t= (Tyre)context.getBean("tyre");
		System.out.println(t);
	}

}
