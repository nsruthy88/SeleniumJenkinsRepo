package com.testng.demo;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority=2)
  public void methoda() {
	  System.out.println("Inside methoda");
  }
  @Test(enabled=false)
  public void methodb() {
	  System.out.println("Inside methodb");
  }
  @Test(priority=1)
  public void methodc() {
	  System.out.println("Inside methodc");
  }
  
  
}
