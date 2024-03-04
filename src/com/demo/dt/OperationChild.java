package com.demo.dt;

import com.demo.method.Operations;

public class OperationChild extends Operations{
	
	public static void main(String[] args) {
		OperationChild op = new OperationChild();
		//System.out.println("Result : "+op.sum(20,30));//default
		//System.out.println("Result : "+op.sub(20,30));//private
		System.out.println("Result : "+op.multiplication(20,30));//protected
		System.out.println("Result : "+op.div(20,30));//public
	}
}
