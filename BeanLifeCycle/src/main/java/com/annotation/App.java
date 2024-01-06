package com.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/book.xml");
		Book book = context.getBean("book1", Book.class);
		System.out.println(book);
		
		context.close();
	}
}
