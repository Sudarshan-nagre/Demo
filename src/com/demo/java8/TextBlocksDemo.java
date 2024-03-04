package com.demo.java8;

public class TextBlocksDemo {

	public static void main(String[] args) {
		String s = "S = 6l2 CSA = 2 × π × r × h CSA = π × r × l S = 4 × π × r 2";
		
		String str = """
				<p>I am normal</p>
				<p style="color:red;">I am red</p>
				<p style="color:blue;">I am blue</p>
				<p style="font-size:50px;">I am big</p>
				
				S = 6l2 CSA = 2 × π × r × h CSA = π × r × l S = 4 × π × r 2
				""";
		System.out.println(s);
		System.out.println(str);
	}

}
