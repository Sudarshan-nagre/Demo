package com.demo.record;

public record StudentRecord(int rollNo, String name, String add) {
	public static String clgName="clgName";
	
	void show() {
		System.out.println("Name : "+name);
		System.out.println("Add : "+add);
	}
	
	static void print() {
		System.out.println("This is static method....");
	}
}


class RecordDemo{
	public static void main(String[] args) {
		StudentRecord r = new StudentRecord(10, "Sudarshan", "Pune");
		System.out.println(r.rollNo());
		r.show();
		
		StudentRecord.print();
		System.out.println(StudentRecord.clgName);
		
		System.out.println(r);
		RecordDemo rr = new RecordDemo();
		System.out.println(rr);
	}
}