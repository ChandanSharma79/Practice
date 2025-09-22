package com.pattern;
import java.util.function.*;
public class Demo {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		Predicate<Integer> p1=i -> i%2==0;
		Predicate<Integer> p2=i -> i>30;
		System.out.println("Below Number are Even number and Greater than 30.");
		for(int n:a) {
			if(p1.and(p2).test(n)) {
				System.out.println(n);
			}
			}
		}

}
