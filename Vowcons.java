package firstPackage;

import java.util.Scanner;

public class Vowcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character=");
		ch=sc.next().charAt(0);
		if(ch>64&&ch<91||ch>96&&ch<123) {
			System.out.print("Entered char is a Vowel or Consonenet");
		}
		else {
			System.out.print("Invalid input");
		}
	}

}
