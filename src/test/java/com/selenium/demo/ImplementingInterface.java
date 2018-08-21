package com.selenium.demo;

public class ImplementingInterface implements Interface1,Interface2 {
	
	public void draw()
	{
		System.out.println("Inside Draw");
	}
	public void draw1()
	{
		System.out.println("Inside draw1");
	}
	public void test()
	{
		System.out.println("Inside Test");
	}
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	public static void main(String[] args) {
		ImplementingInterface inter=new ImplementingInterface();
		inter.draw1();
	}
}
