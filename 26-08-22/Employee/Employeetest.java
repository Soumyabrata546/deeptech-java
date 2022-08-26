package Second;

import java.util.Scanner;

public class Employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int pno,sal;
		System.out.println("Enter employee name, pan no and salary= ");
		name=sc.nextLine();
		pno=sc.nextInt();
		sal=sc.nextInt();
		Employe ob1=new Employe(name,sal,pno);
		System.out.println("Tax Payable="+ob1.getTax());
	}

}
