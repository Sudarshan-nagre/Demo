package com.demo.wrapper;

import java.util.StringTokenizer;

public class WrapperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String s = "Abc";
		
		String s1 = "ABC";//1
		
		if(s == s1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		String s2 = new String("abc");//2
		if(s1 == s2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(s1.equals(s2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		String str = "Hi this is String related classes";
		String[] arr = str.split(" ");
		for(String ss : arr) {
			System.out.println(ss);
		}
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println("Length : "+str.length());
		
		System.out.println(str.charAt(3));
		
		char ch[] = str.toCharArray();
		for(char c : ch) {
			System.out.println(c);
		}
		
		String s12 = "pqr";
		s12.toUpperCase();
		System.out.println(s12);
		
		System.out.println(str.concat(s12));
		
		System.out.println(str.replace("this", "was"));
		
		StringBuffer sb = new StringBuffer("String");
		System.out.println(sb);
		sb.append(" abc");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sbb = new StringBuilder("StringBuilder");
		System.out.println(sbb);
		sbb.append("adjkfgadf");
		System.out.println(sbb);
		
		StringTokenizer st = new StringTokenizer(str,"is");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
