package com.pattern;
import java.util.*;

public class Alpha {
	static int trailingZeroes(int n) {
		int result =0;
		int powerOf5=5;
		while(n>=powerOf5) {
			result=result+(n/powerOf5);
			powerOf5=powerOf5*5;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		System.out.println(trailingZeroes(n));
	}

}
