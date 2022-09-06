package Fresh;

import java.util.Scanner;

public class fifth {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter name=");
Result r1=new Result();
r1.name=sc.nextLine();
System.out.println("Enter RollNo=");
r1.roll_no=sc.nextInt();
System.out.println("Enter Marks1=");
r1.marks1=sc.nextInt();
System.out.println("Enter Marks2=");
r1.marks2=sc.nextInt();
r1.perdisplay();
r1.Percent_cal();
}
}
