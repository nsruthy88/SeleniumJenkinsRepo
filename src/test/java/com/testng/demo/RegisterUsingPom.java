package com.testng.demo;

import org.testng.annotations.Test;

import com.pageobject.RegisterPageObjects;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class RegisterUsingPom {
  WebDriver driver;
  RegisterPageObjects registrationobjects;
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Laterals\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost:9090/servlets/com.mercurytours.servlet.ReservationServlet");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		registrationobjects=PageFactory.initElements(driver, RegisterPageObjects.class);
		//we can have multiple pom files
		/*WebElement frameelement=driver.findElement(By.name("main_page"));
		driver.switchTo().frame(frameelement);
		driver.switchTo().frame(1);*/	
  }
  @Test
  public void f() {
	  registrationobjects.clickRegister();
	  registrationobjects.enterFirstName("arvty");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
