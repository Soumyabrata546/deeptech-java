package Second;

import java.util.Scanner;

//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l,b;
		System.out.println("Enter length and breadth of rectangle=");
		l=sc.nextInt();
		b=sc.nextInt();
		Area ob1=new Area();
		ob1.setDim(l, b);
		System.out.print("Area="+ob1.getArea());
	}

}
