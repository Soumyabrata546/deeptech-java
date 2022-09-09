package com.java.unit.unit1;
//1. Take an array
//2.Use two loops -> one loop for iteration and another loop for comparing
//values
//3.While comparing, if the lower index value is greater than higher index value then swap them
//4.Finally print the sorted array.
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40,27,10,60};
		int temp;
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

	}

}
