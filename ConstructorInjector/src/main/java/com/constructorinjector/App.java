package com.constructorinjector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
//		Student student = context.getBean("student1", Student.class);
//		System.out.println(student);

		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("addition.xml");
		Addition addition = context2.getBean("addition",Addition.class);
		System.out.println(addition);
	}
}
