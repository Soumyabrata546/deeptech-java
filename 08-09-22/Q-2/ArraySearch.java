package com.java.unit.unit1;

import java.lang.reflect.Array;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

//write a java program to input an array and use  a method with arguments
//which is having the array and the searched element.Search the element
//using binary search an if element is found return otherwise return false.

public class ArraySearch {

	public static boolean  ser(int a[],int key,int n) {
		int low=0,high,mid;
		high=n-1;
		mid=(low+high)/2;
	for(int i=0;i<=high;i++) {
		if(key==a[i]) {
			return true;
		}
		else if(key>mid) {
			low=mid+1;
			mid=(low+high)/2;
		}
		else if(key<mid) {
			high=mid-1;
			mid=(low+high)/2;
		}
		
	}
	return false;
	}
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
		
		System.out.print(ser(arr,6,n));
		
	}

}
