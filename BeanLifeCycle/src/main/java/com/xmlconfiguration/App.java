package com.xmlconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
        Person person = context.getBean("person1", Person.class);
        System.out.println(person);
        
//        Person person2 = context.getBean("person2", Person.class);
//        System.out.println(person2);
//        
//        Person person3 = context.getBean("person3", Person.class);
//        System.out.println(person3);
        
        context.close();
    }
}
