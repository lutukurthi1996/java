package com.demo.rest;

public class Middlechar {
	public String middlechar(String s) {
	
		String s1[]=s.split(" ");
		String s2="";
		for (String str : s1) {
			int n=str.length()/2;
				if (str.length()%2==0) {
					s2+=str.charAt(n-1);
					s2+=str.charAt(n);
				}
				else {
					s2+=str.charAt(n);
				}
			
			}
		return s2;
	}
}
