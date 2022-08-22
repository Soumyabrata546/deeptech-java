package firstPackage;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" = "+fact);
	}

}
