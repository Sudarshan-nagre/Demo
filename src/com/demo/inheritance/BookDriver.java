package com.demo.inheritance;

public class BookDriver {

	public static void main(String []args) {
		/*
		 * Book b= new Book(1, "java", "james", "oracle", 10); b.getInfo();
		 */
		
		EBook eb = new EBook(1, "java", "james", "oracle", 10, "ebook", "www.ebook.com");
		eb.getInfo();
		eb.show();
		
		System.out.println("String[] : "+args[0]+"\n2 : "+args[1]);
	}
}
