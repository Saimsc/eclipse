package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAinApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");	
 
   Hello obj=(Hello)context.getBean("helloworld");

   obj.method();
   }
}