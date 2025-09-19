package com.pattern;

import java.util.Scanner;

public class LCM {
	static int findLCM(int a,int b) {
		return a*b/euclidHCF(a,b);
	}
	static int euclidHCF(int a,int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
			if(a!=0) {
				return a;
			}
			else {
				return b;
			}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();
		System.out.println("Enter the Number:");
		int b=sc.nextInt();
		System.out.println(findLCM(a,b));
	}

}
