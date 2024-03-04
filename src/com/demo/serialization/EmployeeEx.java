package com.demo.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeEx implements Externalizable{
	
	int empId;
	String empName;
	String empAddress;
	String empEmail;
	long empMobile;
	float empSal;
	
	public EmployeeEx() {
		
	}
	
	public EmployeeEx(int empId, String empName, String empAddress, String empEmail, long empMobile, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empMobile = empMobile;
		this.empSal = empSal;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(empId);
		out.writeObject(empName);
		out.writeObject(empEmail);
		out.writeObject(empAddress);
		out.writeLong(empMobile);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		int id = in.readInt();
		String name = (String)in.readObject();
		String add = (String)in.readObject();
		String email = (String)in.readObject();
		//long mobile = in.readLong();
		
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+add);
		System.out.println("Email : "+email);
		//System.out.println("Mobile : "+mobile);
	}
}
