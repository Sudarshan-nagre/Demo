package com.demo.abstact;

public class Driver {

	public static void main(String[] args) {
		StudentEnc st = new StudentEnc();
		st.setName("Sudarshan");
		st.setEmail("sud@gmail.com");
		st.setRollNo(10);
		
		System.out.println(st.getName());
		System.out.println(st.getRollNo());
		
		StudentEnc st1 = new StudentEnc();
		st1.setName("Sneha");
		st1.setEmail("sneha@gmail.com");
		st1.setRollNo(11);
		
		System.out.println(st1.getName());
		System.out.println(st1.getRollNo());
	}

}
