package com.selenium.demo;

public class AccessEncapsulation {
	
	public static void main(String[] args) {
		Encapsulation enc=new Encapsulation();
		enc.setBookName("States of hour");
		enc.setBookId(2468);
		
		String bookname=enc.getBookName();
		int bkid=enc.getBookId();
		System.out.println("bookname:\n"+bookname+"bkid:"+bkid);
		Encapsulation enc1=new Encapsulation();
		
		
		
		
		
		
/*		MethodOverloading over=new MethodOverloading();
		over.display();
		over.display(10);
		over.display("Akshay");*/
		
		
		
		SalesPerson sp= new SalesPerson();
		sp.calculateIncentive(2000);
		sp.display();
		
		
		
	}

}
