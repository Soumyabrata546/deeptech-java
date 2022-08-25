package Second;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		adddistance ob1=new adddistance();
		adddistance ob2=new adddistance();
	int a1,a2;
	System.out.println("Enter distance in inch=");
	ob1.d1=sc.nextDouble();
	ob1.d2=sc.nextDouble();
	ob1.add();
	System.out.println("Enter distance in feet=");
	ob2.d1=sc.nextDouble();
	ob2.d2=sc.nextDouble();
	ob2.add();
	}

}
