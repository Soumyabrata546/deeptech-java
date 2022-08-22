package firstPackage;

import java.util.Scanner;

public class SumAvg {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n1,n2,n3,n4,n5,sum=0;
	System.out.print("Enter 5 numbers=");
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
	n4=sc.nextInt();
	n5=sc.nextInt();
	sum=n1+n2+n3+n4+n5;
	float avg=sum/5;
	System.out.print("Sum="+sum+"\t Average="+avg);
}
}
