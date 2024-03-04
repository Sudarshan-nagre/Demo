package com.demo.controlstmt;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int i=1;
		
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		
		i=10;
		do{
			System.out.println(i);
			i=101;
		}while(i>100);
	}
}
