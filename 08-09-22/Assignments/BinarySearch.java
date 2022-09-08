package com.java.unit.unit1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size=");
		int n=sc.nextInt();
		int arr[]=new int[20];
		System.out.print("Enter elements in ascending order only=");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter search element=");
		int key=sc.nextInt();
		int low=0,high,mid;
		high=n-1;
		mid=(low+high)/2;
	for(int i=0;i<=high;i++) {
		if(key==arr[i]) {
			System.out.print("Element found at index-"+i);
			break;
		}
		else if(key>mid) {
			low=mid+1;
			mid=(low+high)/2;
		}
		else if(key<mid) {
			high=mid-1;
			mid=(low+high)/2;
		}
		else
			System.out.print("Not found");

	}
	

}
}
