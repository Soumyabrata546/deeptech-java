package com.java.unit.unit1;

import java.io.FileInputStream;
import java.io.IOException;
//WAP to print vowels from a text file
public class File4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("test.txt");
		int i=0;
		while((i=fin.read())!=-1) { 
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
				System.out.print((char)i+" ");
				
		}
		fin.close();
	}

}
