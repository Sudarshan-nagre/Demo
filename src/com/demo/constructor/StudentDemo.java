package com.demo.constructor;

public class StudentDemo {
	
	String studName;
	int studeRollNO;
	String studEmail;
	String studAddress;
	
	public StudentDemo(String studName, int studeRollNO, String studEmail, String studAddress) {
		this.studName = studName;
		this.studeRollNO = studeRollNO;
		this.studEmail = studEmail;
		this.studAddress = studAddress;
	}
	

	public StudentDemo(String studEmail, String studAddress) {
		this.studEmail = studEmail;
		this.studAddress = studAddress;
	}


	public static void main(String[] args) {
		
		StudentDemo Sudarshan = new StudentDemo("Sudarshan", 10, "sudarshan.n@gmail.com", "Pune");
		System.out.println("Email : "+Sudarshan.studEmail);
		
		StudentDemo sneha = new StudentDemo("sneha@gmail.com", "Pune");
		System.out.println("Email : "+sneha.studName);
		
	}
}
