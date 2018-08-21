package com.selenium.demo;

public class Encapsulation {
	private String bookname;
	private int bookid;
	//getter setter in Java
	//this is used to contain reference current class variables.
	
	public void setBookName(String bookname)
	{
		this.bookname=bookname;
	}
	
	public String getBookName()
	{
		return bookname;
	}
	public void setBookId(int bookId)
	{
		this.bookid=bookId;
	}
	public int getBookId() {
		return bookid;
	}
	

}
