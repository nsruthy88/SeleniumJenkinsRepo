package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPageObjects {
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	@FindBy(name="firstName")
	WebElement fstName;
	
	@FindBy(name="lastName")
	WebElement ltName;
	
	@FindBy(name="country")
	WebElement cntry;
	
	public RegisterPageObjects(WebDriver driver) {	
	}
	public void clickRegister()
	{
		register.click();	
	}
	public void enterFirstName(String firstname)
	{
		fstName.sendKeys(firstname);
	}
	
	public void selectCountry(String countryvalue)
	{
		Select cntrydropdown=new Select(cntry);
		cntrydropdown.selectByVisibleText(countryvalue);
	}
	
	
	
	
	
	

}
