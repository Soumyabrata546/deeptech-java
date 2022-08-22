package firstPackage;

import java.util.Scanner;

public class Nsum {
public static void main(String args[]) {
	int n,sum=0;
	System.out.print("Enter a n=");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(i);
		sum+=i;
	}
	System.out.println("Sum of "+n+" natural numbers=\n"+sum);
}
}
