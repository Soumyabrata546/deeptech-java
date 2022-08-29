package Inheritance;
import java.util.Scanner;
public class Mlevel {
public static void main(String args[]) {
Square ob1=new Square();
int a;
System.out.print("Enter side=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
ob1.side=a;
ob1.calarea();
}
}
