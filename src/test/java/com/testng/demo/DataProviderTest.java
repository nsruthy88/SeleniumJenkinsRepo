package com.testng.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="xyz")
  public void f(String username,String password) {
	  System.out.println("username:"+username+"password:"+password);
  }
  
  @DataProvider(name="xyz")
  public Object[][] logindata()
  {
	  Object[][] data= {
			  			{"akshay","sharma"},
			  			{"abc","xyz"}
	  };
	  return data;
	  }
  }
  

