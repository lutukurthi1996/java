package com.demo.rest;

import java.util.Arrays;

public class Alphabetical {
	
	
	public String alphabetical(String str) {
		
		str=str.toLowerCase();
		char[] ch= str.toCharArray();
		Arrays.sort(ch);
		String s="";
		for(char c:ch)
		{
			s+=c;
		}
		return s+"";
	}
}
