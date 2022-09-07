package com.java.unit.unit1;
//Create a junit test case for finding the maximum value in an array

public class Max {
	int max=0;
	int maximum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
