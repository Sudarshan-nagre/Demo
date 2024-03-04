package com.demo.dt;

import com.demo.method.Operations;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(DataTypeDemo.bb);
		
		int local = 10;//local variable
		
		System.out.println(local);
		
		Operations op = new Operations();
		//System.out.println("Result : "+op.sum(20,30));//default
		//System.out.println("Result : "+op.sub(20,30));//private
		//System.out.println("Result : "+op.multiplication(20,30));//protected
		System.out.println("Result : "+op.div(20,30));//public
	}
}
