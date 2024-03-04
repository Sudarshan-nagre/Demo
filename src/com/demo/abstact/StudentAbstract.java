package com.demo.abstact;

public abstract class StudentAbstract {//0-100%

	int rollNo;
	String name;
	
	static String clgName;
	
	public StudentAbstract(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	abstract void getData();
	
	void show() {
		print();
		System.out.println("RollNo : "+rollNo);
		System.out.println("Name : "+name);
	}
	
	private void print() {
		System.out.println("This is private method");
	}
}
