package com.java.unit.unit1;
//Write a program to find the first and the 
//last occurence of the letter 'o'  in "Hello, World".
public class firstandlastOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello world";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='o') {
				System.out.print("First occurance="+i);
				break;
			}
		}
		for(int i=s1.length()-1;i>=0;i--) {
			if(s1.charAt(i)=='o') {
				System.out.print("First occurance="+i);
				break;	
			}
		}
	}

}
