package firstPackage;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number=");
		int num=sc.nextInt();
		int rev=0,rem;
		do {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}while(num!=0);
		System.out.println("Reverse="+rev);
	}

}
