package com.selenium.demo;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		//for each string element in list
		int size=list.size();
		System.out.println("size:"+size);
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		
		
		
	}

}
