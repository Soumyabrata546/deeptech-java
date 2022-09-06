package Fresh;

import java.util.Scanner;


public class sixth {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bookname=");
		String bname=sc.nextLine();
		library l=new library();
		try {
			l.check(bname);
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
	}
}
