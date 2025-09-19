package com.pattern;
import java.util.Arrays;
public class SortElement {
	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	char[] b= {'C','H','A','N','D','A','N'};
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.print("");
	for(int c:a) {
		System.out.print(c+" ");
	}
	System.out.print("\n");
	for(char d:b) {
		System.out.print(d+" ");
	}
}
}
