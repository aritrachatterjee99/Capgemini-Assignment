package com.rest.springREST.main;

public class Calculator {
	double num1;
	double num2;
	
	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
		public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}
	

}
