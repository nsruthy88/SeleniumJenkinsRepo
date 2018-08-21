package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//launching firefox
/*System.setProperty("webdriver.gecko.driver", "C:\\Selenium Laterals\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.phptravels.net/admin");*/
		
		//for chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Laterals\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		driver=new InternetExplorerDriver();
		//webdriver.ie.driver
		
	}

}
