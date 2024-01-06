package com.xmlconfiguration;

public class Person {

	private int personId;
	private String personName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public void init() {
		System.out.println("You are in init method");
	}
	
	public void destroy() {
		System.out.println("You are in destroy method");
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	
}
