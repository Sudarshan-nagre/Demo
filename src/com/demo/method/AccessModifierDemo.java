package com.demo.method;

public class AccessModifierDemo {

	public static void main(String[] args) {
		Operations op = new Operations();
		System.out.println("Result : "+op.sum(20,30));//default
		//System.out.println("Result : "+op.sub(20,30));//private
		System.out.println("Result : "+op.multiplication(20,30));//protected
		System.out.println("Result : "+op.div(20,30));//public
	}

}
