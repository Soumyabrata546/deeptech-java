package firstPackage;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}

}
