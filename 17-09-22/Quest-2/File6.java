package com.java.unit.unit1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class File6 {
//WAP to read the data from two files and write it into another file
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("test.txt");
		FileInputStream fin1=new FileInputStream("test1.txt");
		FileOutputStream fout=new FileOutputStream("test3.txt");
		SequenceInputStream inst=new SequenceInputStream(fin,fin1);
		int i;
		while((i=inst.read())!=-1) {
		fout.write(i);
		}
		inst.close();
		fin1.close();
		fin.close();
		fout.close();
		
	}

}
