package com.demo.rest;

public class LongestWord {
	public String s1;
	public String longestWord() {
	String ar[]=s1.split(" ");
	String s2=" ";
		 for(int i=0;i<=ar.length-1;i++)
		{
		if(ar[i].length()>=s2.length())
		 {
			s2=ar[i];
		}
		}
		 	return s2;

	}
	
}
