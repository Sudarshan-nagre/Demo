package com.demo.java8;

@FunctionalInterface
interface MethodRefIfc{
	void print();
}

@FunctionalInterface
interface MethodRefIfcParam{
	void operation(int a, int b);
}

public class MethodRef {
	
	public static void show() {
		System.out.println("This is static method !!");
	}
	
	void getData() {
		System.out.println("This is getData()!!");
	}

	public MethodRef() {
		System.out.println("This is constructor");
	}
	
	void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
	}
	
	void multi(int a, int b) {
		System.out.println("Multi : "+(a*b));
	}
	public static void main(String[] args) {
		show();
		
		//refer static method
		MethodRefIfc ifc = MethodRef::show;
		ifc.print();
		
		//refer instance method
		MethodRef mr = new MethodRef();
		MethodRefIfc ifc1 = mr::getData;
		ifc1.print();
		
		//refer constructor
		MethodRefIfc ifc2 = MethodRef::new;
		ifc2.print();
		System.out.println("----------------------------------");
		
		MethodRefIfcParam p = (a,b)->{System.out.println("Addition : "+(a+b));};
		p.operation(10,30);
		
		MethodRefIfcParam p1 = mr::multi;
		p1.operation(40,50);
	}
}
