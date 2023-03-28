package com.demo.rest;

public class NotRepeat {
	public String notRepeat(String s) {
		char ch[]=s.toCharArray();
		String  s2="";
		for (int i = 0; i < ch.length; i++) {
			if (!s2.contains(ch[i]+"")) {
				s2+=ch[i];
			}
			
		}
		return s2;
	}
}
