package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPgObj {
	WebDriver driver=new ChromeDriver();
	public RegisterPgObj() {
		WebElement register=driver.findElement(By.linkText("REGISTER"));
	}
	

}
