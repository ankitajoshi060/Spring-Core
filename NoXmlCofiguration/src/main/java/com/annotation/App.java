package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//    	Student student = context.getBean("temp", Student.class);
//    	System.out.println(student);
//    	System.out.println(context.getBean("course"));
    	
    	Student student = context.getBean("temp", Student.class);
    	System.out.println(student);
    	
    	Course course = context.getBean("getCourse", Course.class);
    	System.out.println(course);
    }
}
