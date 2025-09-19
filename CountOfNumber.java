package com.pattern;
import java.util.*;

public class CountOfNumber {

	static int countDigit(int n) {
		int count = 0;
		while(n>0) {
			n=n/10;
			count =count+1;
			
		}
		return count;
		
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number:");
			int n = sc.nextInt();
			System.out.println(countDigit(n));
	}

}
