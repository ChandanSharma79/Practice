package com.pattern;
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows:");
		int n = sc.nextInt();
		System.out.println("Enter the Number of Columns:");
		int m = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("*");			
			}
			
		System.out.println();
		}
		sc.close();
	}

}
