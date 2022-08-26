package Second;

import java.util.Scanner;
public class Fourt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String pnumber,pdesc;
		int quantity;
		double price;
		System.out.println("Enter part no , part description, quantity and price per item=");
		pnumber=sc.next();
		pdesc=sc.next();
		quantity=sc.nextInt();
		price=sc.nextDouble();
		Invoice ob1=new Invoice(pnumber,pdesc,quantity,price);
		System.out.println("Amount="+ob1.getInvoice());
	}
}
