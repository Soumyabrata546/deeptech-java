package com.java.unit.unit1;
//Write a program to find the first and the 
//last occurence of the letter 'o'  in "Hello, World".
public class firstandlastOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello world";
		int findex=s1.indexOf('o');
		int lindex=s1.lastIndexOf('o');
		System.out.print(findex+" "+lindex);
	}

}
