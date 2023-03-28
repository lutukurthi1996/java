package com.demo.rest;

import java.util.Arrays;

public class Array {
	
	int ar[];
	public void createArray(int a) {
		 ar=new int[a];
		
	}
	public void addValue(int value,int ind) {
			if(ind<=ar.length-1)
				ar[ind]=value;
	}
	public String readArray() {
		return Arrays.toString(ar);
	}
}
