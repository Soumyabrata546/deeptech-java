package firstPackage;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a , b and c=");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float d;
		d=(float)Math.sqrt(a*a)-4*a*c;
		if(d>0) {
			System.out.print("Both roots are real and different");
		}
		else if(d==0) {
			System.out.print("Both roots are real and same");

		}
		else {
			System.out.print("Both roots are distinct and imaginary");

		}
//		System.out.print(d);
	}

}
