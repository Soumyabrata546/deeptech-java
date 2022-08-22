package firstPackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
