package com.demo.dt;

public class DataTypeDemo {
	// Primitive  DT
		static short s;
		static byte b;
		static int i;
		static long l;
		static float f;
		static double d;
		static boolean bb;
		static char ch;
	// Non-Primitive  DT
		static String str;
		
		public DataTypeDemo() {
			System.out.println("This is default contrucotr...");
		}
		
		//instance variable
		int ii;
		
	public static void main(String[] args) {
		System.out.println("----Default values of DTs----");
		System.out.println("short : "+s);
		System.out.println("byte : "+b);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		System.out.println("boolean : "+bb);
		System.out.println("char : "+ch);
		System.out.println("String : "+str);
		
		//using object reference
		DataTypeDemo dataTypeDemo = new DataTypeDemo();//creating object
		System.out.println(dataTypeDemo.ii);
		
		//using object
		System.out.println(new DataTypeDemo().ii);
	}
}
