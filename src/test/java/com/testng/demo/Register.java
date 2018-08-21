package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


public class Register {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	 public void beforeTest(String browser) throws InterruptedException {
		System.out.println("browser is:"+browser);
		
		if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Laterals\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Laterals\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("http://localhost:9090/servlets/com.mercurytours.servlet.ReservationServlet");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
	  }
	
	@Test 
  public void f() {
		//System.out.println("Name of the class:"+getClass().getSimpleName()+"\t inside Thread"+Thread.currentThread().getId());
		
		//driver methods
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
		
		try {
			Assert.assertEquals(title,"Welcome Mercury Tours");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			System.out.println("handled exception");
		}
		
		//driver.navigate().back();
		
		driver.getCurrentUrl();
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();		
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys("Akshay");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Sharma");
		
		
		WebElement country=driver.findElement(By.name("country"));
		//select in selenium for dropdowns
		
		Select countryvalue=new Select(country);
		countryvalue.selectByVisibleText("INDIA");
		Reporter.log("Completed tests");
		
		
  }
  
  @AfterTest
  public void afterTest() {
	  //driver.quit();
	  
  }

}
