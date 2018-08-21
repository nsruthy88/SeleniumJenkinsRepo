package com.selenium.demo;

public class Employee {
	
	private int empId;
	private String employeeName;
	public int inhertancevariable;
	//constructor
	public Employee() {
		
		try {
			System.out.println("Inside Employee class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//constructor overloading
	public Employee(String empname) {
		
		this.employeeName=empname;

		
	}
	
	
	public void display()
	{
		System.out.println("empid is:"+empId+"employename is :"+employeeName);
	}
	

}
