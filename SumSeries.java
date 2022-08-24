package firstPackage;

import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n=");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum+=(float)1/i;
		}
		System.out.print("Sum="+sum);
	}

}
