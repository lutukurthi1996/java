package com.demo.rest;

public class Variable {
 public int add(String...string)
 {
	 int sum=0;
	 for(String i:string)
	 {
		 sum+=Integer.parseInt(i);
	 	
	 }
	 return sum;
 }
}
