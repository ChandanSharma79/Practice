package com.pattern;
import java.util.Arrays;

public class Equals {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		boolean r = Arrays.equals(a,b);
		if(r) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
	}

}
