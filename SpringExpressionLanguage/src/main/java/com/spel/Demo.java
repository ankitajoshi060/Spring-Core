package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("100")
	private int id;
	@Value("Mark")
	private String name;
	@Value("#{T(java.lang.Math).sqrt(49)}") // expression=static method
	private double sqrt;
	@Value("#{T(java.lang.Math).PI}") // expression=variable
	private double val;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", sqrt=" + sqrt + ", val=" + val + "]";
	}




	
	
	
}
