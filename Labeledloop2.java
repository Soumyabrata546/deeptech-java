package firstPackage;

public class Labeledloop2 {
	public static void main(String args[])
	{
	outer_loop:
		for(int i=1;i<=3;i++)
		{
			inner_loop:
				for(int j=1;j<=3;j++) 
				{
					if(i*j==3)
						continue outer_loop;
					System.out.println(i*j);
				}
		}
		
		
	}
}