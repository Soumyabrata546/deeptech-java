package com.java.unit.unit1;
//write a java program to remove the characters at 
//even indexes and then print the new string without 
//using any method for removing
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="myself soumya",s2="";
		for(int i=1;i<s1.length();i+=2) {
			s2+=s1.charAt(i);
		}
		System.out.print(s2);
	}

}
