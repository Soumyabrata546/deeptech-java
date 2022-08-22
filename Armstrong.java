package firstPackage;

import java.util.Scanner;

public class Armstrong {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number=");
	int a=sc.nextInt();
	int rem,sum=0,tmp=a;
	while(a!=0) {
		rem=a%10;
		sum=sum+(rem*rem*rem);
		a=a/10;
	}
	if(tmp==sum)
		System.out.println("It is an armstrong number");
	else
		System.out.println("It is not an armstrong number");
}

}
