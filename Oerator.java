package firstPackage;

import java.util.Scanner;

public class Oerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		System.out.println("Enter two numbers=");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter operator=");
		ch=sc.next();
		int res;
		switch(ch) {
		case "+":res=n1+n2;
			System.out.print(n1+" + "+n2+" = "+res);
			break;
		case "-":res=n1-n2;
		System.out.print(n1+" - "+n2+" = "+res);
		break;
		case "*":res=n1*n2;
		System.out.print(n1+" * "+n2+" = "+res);
		break;
		case "/":res=n1/n2;
		System.out.print(n1+" / "+n2+" = "+res);
		break;
		}
	}
}
