package com.pattern;
import java.util.*;
public class CheckElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Item:");
		String t=sc.next();
		String[] arr= {"Sugar","Rice","Wheat","Tea","Milk","Chocolate"};
		boolean isPresent=false;
		for(String a:arr) {
			if(a.equals(t)) {
				isPresent=true;
				break;
			}
		}
		if(isPresent) {
			System.out.println(t+ " is present in the array.");
			}
		else {
			System.out.println(t+" not present in the array");
		}
	}

}
