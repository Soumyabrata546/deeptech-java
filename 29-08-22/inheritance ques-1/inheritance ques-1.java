// Create a class called Shape which has a property side.
// Create a subclass of Shape called Square which should use the property of 
// Shape class to display area of square
// Note: Take input
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
