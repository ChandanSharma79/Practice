package com.pattern;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
	String[] names = {"Apple","Banana","Cat","Dog","Elephant"};
	Arrays.sort(names,Collections.reverseOrder());
	System.out.println(Arrays.toString(names));
	}
}
