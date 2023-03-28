package com.demo.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class FileOp 
{
	public String loadData(String fileName) throws Exception 
	{
		FileOutputStream out=new FileOutputStream("C:\\b4\\"+ fileName+".txt",true);
		String data="Hope all doing great";
		out.write(System.lineSeparator().getBytes());
		out.write(data.getBytes());
		
		return "data saved";
	}
	
	public String readData(String fileName) throws Exception {
		FileInputStream in= new FileInputStream("C:\\b4\\"+ fileName+".txt");
		int ch=in.read();
		String data="";
		while(ch!=-1) {
			if(ch==13)
				data+="<br>";
			else
				data+=(char)ch;
			ch=in.read();
			
		}
		return  data;
	}
	public String compress() throws Exception
	{
		 FileInputStream fin=new FileInputStream("c:/b4/karuninchina akasam.png");
		 DeflaterInputStream din=new DeflaterInputStream(fin);
		 FileOutputStream fout=new FileOutputStream("c:/b4/compress.txt");
		 int ch=din.read();
		 while(ch!=-1)
		 {
			 fout.write(ch);
			 ch=din.read();
		 }
		 return "compressed";
	}
	public String decompress() throws Exception 
	{
		FileInputStream fin=new FileInputStream("c:/b4/susu.txt");
		InflaterInputStream iin=new InflaterInputStream(fin);
		FileOutputStream fout=new FileOutputStream("c:/b4/susu.jpg");
		 int ch=iin.read();
		 while(ch!=-1)
		 {
		fout.write(ch);
		ch=iin.read();
		}
 return "decompressed";
} 
	public String readline(int linenum) throws Exception {

		FileInputStream in = new FileInputStream("c:/b4/mydata.txt");
		int ch = in.read();
		int count=0;
		String data = "";
		 while(ch!=-1) 
		 {
			 if(ch==13) 
			 {
				 count++;
			 }
			 if(count==linenum-1)
			 {
				 data+=(char)ch;
			 }
			 
			 ch = in.read();
		}
		return data;
		}
	
	public String arraydisplay() throws Exception {
		int a[]= {10,20,30,40};
		String s= Arrays.toString(a);
		
		FileOutputStream out = new FileOutputStream("c:/b4/array.txt");
		
		out.write(s.getBytes());
		return "data saved";
	}
	
	public String copyFile() {
		
	}
}

