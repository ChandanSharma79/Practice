package com.practice;
import java.util.function.*;

public class LambaaFunctionMethod {
	public static void main(String[] args) {
		Function<Integer,Integer> f=n -> n*n;
		Function<String,Integer> str=n -> n.length();
		System.out.println(f.apply(6));
		System.out.println(str.apply("Mohit"));
	}

}
