package com.selenium.demo;

class VariableDemo
{
	public static void main(String args[])
	{
		int loop;
		for(loop=0;loop<=10;loop++)
		{
			System.out.println("Inside loop");
		}
		
		int arr[]= {1,2,3,4,5};
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		
		
		
		byte b=10;
		short s=20;
		int i=30;
		long l=12345678901l;
		float f1=10;
		float f2=10.00f;
		double d=11.11;
		char ch='a';
		boolean flag=true;
		String str="akshay";


		System.out.println("Value of byte variable is  "+b);
		System.out.println("Value of short variable is  "+s);	

		System.out.println("Value of int variable is  "+i);	

		System.out.println("Value of long variable is  "+l);	

		System.out.println("Value of float variable is  "+f1);	
		System.out.println("Value of float variable is  "+f2);
		System.out.println("Value of double variable is  "+d);	

		System.out.println("Value of char variable is  "+ch);	
		System.out.println("Value of boolean variable is "+flag);
		
		
	}

}