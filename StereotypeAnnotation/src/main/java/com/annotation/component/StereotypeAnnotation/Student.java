package com.annotation.component.StereotypeAnnotation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("101")
	private int studentId;
	@Value("John")
	private String studentName;
	@Value("#{addressList}")
	private List<String> studentAddress;
	
	@Value("#{courseSet}")
	private Set<Course>course;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(List<String> studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", course=" + course.toString() + "]";
	}
	
	
}
