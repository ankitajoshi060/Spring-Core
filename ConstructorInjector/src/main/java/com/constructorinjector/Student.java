package com.constructorinjector;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private List<String> course;
	private Address address1;

	public Student(int studentId, String studentName, List<String> course, Address address1) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", address="
				+ address1 + "]";
	}

}
