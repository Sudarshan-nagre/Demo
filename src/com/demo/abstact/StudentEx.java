package com.demo.abstact;

public class StudentEx extends StudentAbstract{

	public StudentEx(int rollNo, String name) {
		super(rollNo, name);
	}

	@Override
	void getData() {
		System.out.println("This is normal method()");
	}
	
	public static void main(String[] args) {
		StudentEx st = new StudentEx(10, "Shiv");
		st.getData();
		st.show();
	}

}
