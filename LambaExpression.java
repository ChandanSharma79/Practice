package com.pattern;
import java.util.function.*;
public class LambaExpression {
	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>10);
		//System.out.println(p.test(11));
		Predicate<String> str = i->(i.length()>4);
		//System.out.println(str.test("Chandan"));
		String names[] = {"Chandan","Sharma","Aditya","Sukh"};
		for(String nm : names) {
			if(str.test(nm)) {
				System.out.println(nm);
			}
		}
	}

}
