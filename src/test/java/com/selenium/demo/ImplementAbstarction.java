package com.selenium.demo;

public class ImplementAbstarction extends AbstractClass{
	
	public void draw()
	{
		System.out.println("This is Abstarct class method implemented");
	}
	public static void main(String[] args) {
		ImplementAbstarction imp=new ImplementAbstarction();
		imp.draw();
	}

}
