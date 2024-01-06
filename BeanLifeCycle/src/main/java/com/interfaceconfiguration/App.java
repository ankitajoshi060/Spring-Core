package com.interfaceconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("product.xml");
		Product product =context.getBean("product1", Product.class);
		System.out.println(product);
		
		context.close();// this method use to call destroy method
	}
}
