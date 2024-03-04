package com.demo.java8;

import com.demo.serialization.EmployeeEx;

public class JDK10Features {
	
	static void add(int a, int b) {
		var result = a+b;
		System.out.println(result);
		
		for(var i=1;i<10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		//local variable type inference
		var s = "Sudarshan";
		System.out.println(s);
		
		var var = 20;
		System.out.println(var);
		
		var no=20.34f;
		System.out.println(no);
		
		add(10,20);
		
		var v = new EmployeeEx();
		v.toString();
	}
}
