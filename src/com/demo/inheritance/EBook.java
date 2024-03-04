package com.demo.inheritance;

public class EBook extends Book{

	String bookType;
	String bookLink;
	
	public EBook(int bookId, String bookName, String bookAuthor, String publication, 
			int qnty, String bookType, String bookLink) {
		super(bookId, bookName, bookAuthor, publication, qnty);
		this.bookType = bookType;
		this.bookLink = bookLink;
	}
	
	
	void show() {
	//	super.getInfo();
		System.out.println("BookType : "+bookType);
		System.out.println("BookLink : "+bookLink);
	}
}
