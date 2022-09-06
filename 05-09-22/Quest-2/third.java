package Fresh;
//Write a Java Program to Create Account with 500 Rs Minimum Balance
//Create  a Class Called LessBalanceException Which returns
//the Statement that Says WithDraw Amount(_Rs) is Not Valid if the amount withdrawn is more than the
//balance.

public class third {
	static void checkbal(double bal,double w_amount)throws  lessBalanceException{
		if(w_amount>bal) {
			throw new lessBalanceException("Withdrawl not possible");
		}else
			System.out.print("Withdrawl done");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double bal=500;
	String name="Soumyabrata";
	String type="Savings";
	try {
		third.checkbal(bal, 10000);
	}catch(lessBalanceException e) {
		System.out.print(e.getMessage());
	}

}
}
