package com.demo.rest;

public class Count {


		public String CheckOvlConSum(String s)

	{

	String str = s.toUpperCase();

	int ovl=0;

	int con=0;

	char[] c = str.toCharArray();

	for (int i = 0; i < c.length; i++)

	{

	if (c[i]=='A' ||c[i]=='E' ||c[i]=='I' ||c[i]== 'O'||c[i]=='U' )

	{

	ovl+= c[i]-64;

	}

	else

	{

	con+= c[i]-64;

	}

	}

	return "sum of ovels : "+ovl+" sum of consonents : "+con;

	}

	}

