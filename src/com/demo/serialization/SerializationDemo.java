package com.demo.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	EmployeeEx empEx = new EmployeeEx(101, "Sudarshan", "Pune", "sud@gamil.com", 99426745622l, 1234.456f);
	
	void serializationDemo() {
		try {
			Employee emp = new Employee(101, "Sudarshan", "Pune", "sud@gamil.com", 99426745622l, 1234.456f);
			ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(new File("employee.txt")));
			oops.writeObject(emp);
			System.out.println("File write done !!!");
			oops.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void deSerializationDemo() {
		try {
			ObjectInputStream oips = new ObjectInputStream(new FileInputStream(new File("employee.txt")));
			Object obj = oips.readObject();
			oips.close();
			
			Employee emp = (Employee)obj;
			
			System.out.println(emp.empName);
			System.out.println(emp.empId);
			System.out.println(emp.empAddress);
			System.out.println(emp.empSal);
			System.out.println(emp.empMobile);
			System.out.println(emp.empEmail);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void writeExternal() {
		try {
			ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(new File("employeeEx.txt")));
			oops.writeObject(empEx);
			System.out.println("File write done !!!");
			oops.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void readExternal() {
		try {
			ObjectInputStream oips = new ObjectInputStream(new FileInputStream(new File("employeeEx.txt")));
			Object obj = oips.readObject();
			
			EmployeeEx ex = (EmployeeEx)obj;
			
			oips.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		SerializationDemo d = new SerializationDemo();
		//d.serializationDemo();
		//d.deSerializationDemo();
		//d.writeExternal();
		d.readExternal();
	}

}
