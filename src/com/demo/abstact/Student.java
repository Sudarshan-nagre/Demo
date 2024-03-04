package com.demo.abstact;

public interface Student {//100%

	public static final String CLGNAME ="ABC";//variable
	
	public void showStudent();//abstract method
	
	//no constructor JDK - 1.7
	//JDK-1.8
	public static void show() {
		System.out.println("This is static show()");
	}
	
	default void print() {
		getData();
		System.out.println("This si default print()");
	}
	
	//JDK-1.9
	private void getData() {
		System.out.println("This is private getData()");
	}
}
