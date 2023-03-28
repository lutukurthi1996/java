package com.demo.rest;

public class Experience {
	int id;
	String name;
	double salary;
	int skill;
	int exp;
	public Experience(int id, String name,  int skill, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
		this.exp = exp;
	}
	public String toString() {
		return "Experience[id="+id +",name="+name+",salary="+salary+",skill="+skill+",exp="+exp+"]";
	
	}
}
