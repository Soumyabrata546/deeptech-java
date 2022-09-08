package com.java.unit.unit1;

public class Transpose {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		int a[][]= {{3,2,4},{2,8,4},{1,2,3}};
		System.out.println("The matrix is-");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("After transpose->");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(a[j][i]+"  ");
			}
			System.out.println();
		}
	}

}
