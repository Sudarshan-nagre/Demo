package com.demo.java8;

public class SwitchExpressionJDK14Demo {

	void show() {
		int day = 2;

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Default...");
			break;
		}
	}

	public static void main(String[] args) {
		int day = 1;
		String s1 = null;
		/*
		 * String s = switch (day) { case 1 -> { System.out.println("Hi"); yield
		 * "Sunday"; } case 2 -> "Monday"; case 3 -> "Tuesday"; default -> "Default...";
		 * };
		 */
		//System.out.println(s);
		
		//System.out.println(s1.length());
		
		Employee e = null;
		System.out.println(e.getEmpName());
		
	}
}
