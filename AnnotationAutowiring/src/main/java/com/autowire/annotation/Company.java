package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

	private int companyId;
	private String companyName;
	@Autowired
	private Employee employee;

	public Company() {
		super();
	}
	
	public Company(int companyId, String companyName, Employee employee) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.employee = employee;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", employee=" + employee + "]";
	}
	
}
