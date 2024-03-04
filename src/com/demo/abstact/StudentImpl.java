package com.demo.abstact;

public class StudentImpl implements Student {

	public static void main(String[] args) {
		StudentImpl st = new StudentImpl();
		st.showStudent();
		Student.show();
		st.print();
		System.out.println(Student.CLGNAME);
	}

	@Override
	public void showStudent() {
		System.out.println("This is showStudent()");
	}

}
