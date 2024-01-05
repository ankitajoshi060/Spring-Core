package com.constructorinjector;

public class Addition {

	private int number1;
	private int number2;
	
	public Addition(double number1, double number2) {
		super();
		System.out.println("double");
		this.number1 =(int) number1;
		this.number2 =(int)number2;
	}
	
	public Addition(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
	
	
//	public Addition(String number1, String number2) {
//		super();
//		System.out.println("string");
//		this.number1 =Integer.parseInt(number1);
//		this.number2 =Integer.parseInt(number2);
//	}

	@Override
	public String toString() {
		return "Addition ["+ (number1 + number2) +" ]";
	}
	
	
}
