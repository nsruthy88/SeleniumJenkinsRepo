package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class BrowserLaunch {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	//https://www.phptravels.net/login
	  //Launch on chrome
	 /* System.setProperty("webdriver.chrome.driver", "C:\\Selenium Laterals\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	 */ 
	  //Launch on firefox
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Laterals\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  //Launch on ie
	  
	  /*System.setProperty("webdriver.ie.driver", "C:\\Selenium Laterals\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();*/
	  
	  driver.manage().window().maximize();
	  driver.get("http://localhost:9090/servlets/com.mercurytours.servlet.WelcomeServlet");
	  
	  
  }

  
  @Test
  public void f() {
	  
	  WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
	  username.sendKeys("mercury");
	  
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("mercury");
	  
	  
	  WebElement login=driver.findElement(By.xpath("//input[@name='login']"));
	  login.click();
	  
	  //Register
	  
	  WebElement register=driver.findElement(By.linkText("REGISTER"));
	  register.click();
	  
	  
	  
	  
	  
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
