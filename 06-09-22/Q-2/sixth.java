package Fresh;

import java.util.Scanner;


public class sixth {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bookname=");
		String bname=sc.nextLine();
		library l=new library();
		l.check(bname);
		
	}
}
