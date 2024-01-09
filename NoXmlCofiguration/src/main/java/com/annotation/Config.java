package com.annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.annotation")
public class Config {

	@Bean({"student", "temp"})
	public Student getStudent() {
		
		Student student = new Student();
		return student;
	}
	
	@Bean
	public Course getCourse() {
		Course course = new Course();
		return course;
	}
}
