package com.demo.rest;

public class Replace {
	public String replace(String s1, String s2) {
		char[] ch=s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (s1.contains(ch[i]+"")) {
			s2=s2.replace(ch[i], '*');
			
			}
			}
		return s2+"";
		
	}
}
