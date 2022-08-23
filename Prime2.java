package firstPackage;

import java.util.Scanner;

public class Prime2 {
	public static void main(String args[])
	{
		boolean flag=false;
		for(int j=15;j<=30;j++) 
		{
		for(int i=2;i<j/2;i++)
		{
			if(j%i==0)
			{
			flag=true;
			break;
			
			}
			
		}
		if(flag==false)
		System.out.println(j);
		flag=false;
		}
		}
	}