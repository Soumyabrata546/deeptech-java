package firstPackage;

import java.util.Scanner;

public class CubeN {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter n=");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Cube of "+i+"="+i*i*i);
		}
}
}
