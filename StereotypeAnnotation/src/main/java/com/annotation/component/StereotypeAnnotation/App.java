package com.annotation.component.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");
       Student student = context.getBean("student", Student.class);
       System.out.println(student);
       
       Course course = context.getBean("course2" ,Course.class);
       System.out.println(course);
    }
}
