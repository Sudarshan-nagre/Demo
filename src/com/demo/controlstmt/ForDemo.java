package com.demo.controlstmt;

public class ForDemo {

	public static void main(String[] args) {

		for(int i=1 ; i<=200 ; i++) {
			if( i == 120) {
				continue;
			}
			System.out.println(i);
		}
		
		/*
		 * for( ; ; ) { System.out.println("Hello"); }
		 */
	}
}
