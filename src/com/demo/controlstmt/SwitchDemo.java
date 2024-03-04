package com.demo.controlstmt;

public class SwitchDemo {

	public static void main(String[] args) {
		int a = 1;
		
		String str = "hindi";
		
		char c = 'a';

		switch (c) {
		case 'c': {
			System.out.println("Result : "+str);
			break;
		}
		case 'a': {
			System.out.println("Result : "+str);
			break;
		}
		case 'v': {
			System.out.println("Result : "+str);
			break;
		}
		default:
			System.out.println("This is default case");
		}
	}
}
