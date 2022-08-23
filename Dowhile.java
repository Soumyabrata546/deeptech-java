package firstPackage;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,res;
		String s="";
		do{
		System.out.print("Enter two numbers=");
		x=sc.nextInt();
		y=sc.nextInt();
		res=x+y;
		System.out.println("Result="+res);
		System.out.println("Do you want to perform agin ?");
		s=sc.next();
		}while(s=="y");
	}

}
