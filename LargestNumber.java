package com.pattern;

public class LargestNumber {
	static int arr[] = {10,20,30,40,50};
	static int largest() {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(largest());
	}
}
