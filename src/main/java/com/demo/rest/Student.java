package com.demo.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
	private static final long serialVersionUID = 8494108763991357587L;
	int id;
	String name;
	String course;
	double fees;
	
	public Student(int id, String name, String course, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}
	
	public String serialisation() throws Exception {
		Student s[]=new Student[4];
		
		Student s1=new Student(101,"Sai","java",5000);
		Student s2=new Student(102,"Teja", "python", 6000);
		Student s3=new Student(103,"sushmita","dotnet",7000);
		Student s4=new Student(104,"lavanya","javascript",8000);
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		FileOutputStream fout= new FileOutputStream("c:/b4/serialisation.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s);
		return "file created successfully";
	}
	public String deserialisation() throws Exception
	{
		FileInputStream fin=new FileInputStream("c:/b4/serialisation.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student[] std=(Student[])in.readObject();
		String str = "";
		for (int i = 0; i < std.length; i++)
		{
			str +=std[i].toString()+"<br>";
		}
		return str;
		}
	
	
}
