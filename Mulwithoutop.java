package firstPackage;

import java.util.Scanner;

public class Mulwithoutop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two nos=");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n2;i++) {
		sum+=n1;	
		}
		System.out.print("Multiplication value="+sum);
	}

}
