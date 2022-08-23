package firstPackage;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,gcd=1,tmp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers=");
		num1=sc.nextInt();
		num2=sc.nextInt();
		tmp=num1>num2?num1:num2;
		for(int i=2;i<=tmp/2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
				
			}
		}
		System.out.print(gcd);
	}

}
