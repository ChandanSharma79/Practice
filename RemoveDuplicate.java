package com.pattern;

public class RemoveDuplicate {
static int removeDuplicate(int[] arr) {
	int n = arr.length;
	if(n<=1) {
		return n;
	}
	int idx=1;
	for(int i=1;i<n;i++) {
		if(arr[i]!=arr[i-1]) {
			arr[idx++]=arr[i];
		}
	}
	return idx;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,4};
		int newSize = removeDuplicate(arr);
		for(int i=0;i<newSize;i++) {
		System.out.println(arr[i]+" ");
		}
	}
}
