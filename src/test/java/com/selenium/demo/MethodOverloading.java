package com.selenium.demo;

public class MethodOverloading {
	int a;
	String b;
	
	public void display() {
		System.out.println("Inside Display");
		
	}
	public void display(int a)
	{
		this.a=a;
	}
	public void display(String b)
	{
		this.b=b;
	}
	public void display(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
}
