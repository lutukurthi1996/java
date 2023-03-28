package com.demo.rest;

public class Total {
	public String total(String s) {
		String[] str=s.split(",");
		int total=0;
		for(int i=0;i<str.length;i++) {
			
			 float n=Float.parseFloat(str[i]);
			 if(n%2==0)
			 {
				 total+=n;
			 }
			 else {
				 total-=n;
			 }
			 
		}
		
		return total+"";
	}
}
