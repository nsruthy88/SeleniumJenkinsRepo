package com.selenium.demo;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	static WebDriver driver;
	
	public static void main(String str[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Laterals\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost:9090/servlets/com.mercurytours.servlet.ReservationServlet");
		//username admin
	/*	Email admin@phptravels.com
		Password demoadmin*/
		//https://www.phptravels.net/login
	/*	Email user@phptravels.com
		Password demouser*/
		
		
		/*http://opensource.demo.orangehrmlive.com/
			Admin
			admin*/
		//driver.findElement(By.name("userName")).sendKeys("mercury");
	}
	
	/*public static void main(String[] args) {
		

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		
	}*/

}
