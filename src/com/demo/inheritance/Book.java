package com.demo.inheritance;

public class Book extends Object{

	int bookId;
	String bookName;
	String bookAuthor;
	String publication;
	int qnty;
	
	public Book(int bookId, String bookName, String bookAuthor, String publication, int qnty) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.publication = publication;
		this.qnty = qnty;
	}

	void getInfo() {
		System.out.println("bookId : "+bookId);
		System.out.println("BookName : "+bookName);
		System.out.println("BookAuthor : "+bookAuthor);
	}
	
}
