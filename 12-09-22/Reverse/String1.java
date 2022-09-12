package com.java.unit.unit1;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name=");
		s1=sc.nextLine();
		int len=s1.length()-1;
		for(int i=len;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
