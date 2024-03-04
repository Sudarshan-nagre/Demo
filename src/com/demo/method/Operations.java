package com.demo.method;

public class Operations {

	//method overloading
	
	int sum(int a, int b,int c) {
		return a + b+c;
	}
	
	int sum(int a, int b) {
		return a + b;
	}
	
	float sum(int a, float b) {
		return a + b;
	}
	
	private int sub(int a, int b) {
		return a - b;
	}
	
	protected int  multiplication(int a, int b) {
		int mul = a*b;
		//System.out.println("Result : "+mul);
		return mul;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] a) {
		Operations op = new Operations();
		System.out.println("Result : "+op.sum(20,12.4f));
		System.out.println("Result : "+op.sub(20,30));
		System.out.println("Result : "+op.multiplication(20,30));
		System.out.println("Result : "+op.div(20,30));
		main("Shjhdkj");
	}
	public static void main(String args) {
		System.out.println("Main()");
	}
}
