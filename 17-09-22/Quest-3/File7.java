package com.java.unit.unit1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File7 {
	
//WAP to count the number of letters in a file
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("test.txt");
		int i,count=0;
		
		while((i=fin.read())!=-1) {
		if(i!=' ')
			count++;		
		}
		System.out.print(count);
	}

}
