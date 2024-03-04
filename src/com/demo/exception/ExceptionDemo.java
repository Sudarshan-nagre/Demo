package com.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	void checkAge(int age) throws InvalidAgeException {
		if (age > 18) {
			System.out.println("Valid age");
		} else {
			throw new InvalidAgeException("Invalid age");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ExceptionDemo d = new ExceptionDemo();
		d.checkAge(19);
		
		String s1 = "abc";
		String s2 = s1.intern();
		
		if(s1 == s2) {
			System.out.println("true");
		}
		
		String s3 = new String("abc");
		String s4 = s3.intern();
		
		if(s2 == s4) {
			System.out.println("true");
		}
	}
}
