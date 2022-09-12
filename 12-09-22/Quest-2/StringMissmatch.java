package com.java.unit.unit1;

public class StringMissmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello1",s2="hello2";
		try {
			if(s1==s2)
				System.out.print("Matched");
			else
				throw new MissmatchException("Missmatched");
		}
		catch(MissmatchException e){
			System.out.print(e.getMessage());
		}
	}

}
