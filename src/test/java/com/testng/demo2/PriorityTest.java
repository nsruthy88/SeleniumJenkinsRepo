package com.testng.demo2;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority=1)
  public void testcase1() {
	  System.out.println("Inside test case 1");
  }
  
  @Test(priority=2,enabled=false)
  public void testcase2() {
	  System.out.println("Inside test case 2");
  }
  
  @Test(priority=3)
  public void testcase3() {
	  System.out.println("Inside test case 3");
  }
}
