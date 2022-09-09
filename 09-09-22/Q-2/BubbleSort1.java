package com.java.unit.unit1;

import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40,27,10,60};
		int temp;
		int flag=0;
		System.out.println("Array is =");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println("\nAfter sorting Array is =");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");	
		}
		System.out.println("Enter the element you want to search=");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(no==arr[i]) {
				System.out.print("Element found");	
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.print("Not found");
		}
	}
	}

