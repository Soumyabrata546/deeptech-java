package com.java.unit.unit1;

import java.util.Scanner;

//Write a Java Program to Search a Particular Word in a String
public class ParticularWordSer {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1="hello world";
		String arr[]=s1.split(" ");
		System.out.print("Enter a word you want to search=");
		String s2=sc.next();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=s1.length();j++) {
			if(arr[i].charAt(j)==s1.charAt(j))	
				System.out.print("Found");
			else 
				System.out.print("not Found");
			break;
			}	
		}
		
	}

}
