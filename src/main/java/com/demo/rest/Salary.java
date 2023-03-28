package com.demo.rest;

public class Salary {
	int id;
	String name;
	double sal;
	double bonus;
	double total;

	
	public Salary(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		
	}

	
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() 
	{
		return "Salary [id=" + id + ", name=" + name + ", sal=" + sal + " ,bonus="+ bonus + ",total=" + total+"]"+"<br>";
	}
	
}
