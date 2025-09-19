package com.pattern;
import java.util.*;
public class HCF {
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
		System.out.println("Enter your number:");
		int a = sc.nextInt();
		System.out.println("Enter your 2 number:");
		int b = sc.nextInt();
		System.out.println(euclidHCF(a,b));
	}

}
