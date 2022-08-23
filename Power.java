package firstPackage;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,pow=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y =");
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i=1;i<=y;i++) {
			pow*=x;
		}
		System.out.print(x+" ^ "+y+" = "+pow);
	}

}
