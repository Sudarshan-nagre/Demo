package com.demo.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 23L;
	
	int empId;
	String empName;
	String empAddress;
	String empEmail;
	long empMobile;
	transient float empSal;
	
	public Employee(int empId, String empName, String empAddress, String empEmail, long empMobile, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empMobile = empMobile;
		this.empSal = empSal;
	}
}
