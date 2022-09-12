package com.java.unit.unit1;

import java.util.Scanner;

import javax.security.sasl.AuthenticationException;

//Write a program to accept a password from the user and throw 
//'Authentication Failure' exception if the password is incorrect.
public class StringPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass,valid="hello";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a password=");
		pass=sc.nextLine();
		try {
			if(pass.equals(valid))
			{
				System.out.print("Correct");
			}
			else 
				throw new AuthenticationException("Wrong password");
		}
		catch(AuthenticationException e) {
			System.out.print(e.getMessage());
		}
	}

}
