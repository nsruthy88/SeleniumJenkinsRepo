package com.selenium.demo;

public class BasicJava {
	
	public static void main(String[] args) {
		
		Student st=new Student();
		st.rollno=123;
		st.display();
		
		
		
		
		
		
		
		int arr[]= {5,6,12,14};
		//basic for loop
		for(int i=0;i<=(arr.length-1);i++)
		{
			System.out.println("inside for loop \n"+arr[i]);
		}
		//Advanced For loop //for each loop
		for(int values:arr)
		{
			System.out.println("values are :"+values);
		}
		
	}

}
