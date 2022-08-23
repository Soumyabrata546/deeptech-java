package firstPackage;

public class Labeledloop1 {
public static void main(String[] args)
{
	
 outer: for(int i = 1; i <= 5; i++)
 {
//  System.out.println(i);	 
// Inner loop. 
 for(int j = 1; j <=3; j++)
 {
  System.out.print(i);
  if(i == j)
    continue outer;  
  }
 System.out.print("\n");
 }
}
}