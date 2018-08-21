package com.selenium.demo;

public class SalesPerson extends Employee {
	
	private int incentive;
	private double basicsalary;
	
	public void printinh()
	{
		System.out.println(inhertancevariable);
	}
	
	SalesPerson()
	{
		super("Training Room");
	}
	
	public double calculateIncentive(int incentive)
	{
		this.incentive=incentive;
		return incentive;
	}
	public void display()
	{
		super.display();
		System.out.println("incentive:"+incentive+"basesalary:"+basicsalary);
	}

}
