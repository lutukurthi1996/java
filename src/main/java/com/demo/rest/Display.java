package com.demo.rest;

public class Display {

		public String display(int a) {

		int array[]= {1,2,3,4,5,6,7,8,9,10};
		if(a<array.length) {
			return "index value is: "+array[a];
			
		}
		else
		{
			return "invalid index";
		}
		}
		
	}

