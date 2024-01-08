package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/collection.xml");
		Employee employee1 = context.getBean("employee1", Employee.class);
		System.out.println(employee1);
		System.out.println(employee1.getProperties().getClass().getName());

	}
}
