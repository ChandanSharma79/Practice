package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class SortedDemo {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(9,83,32,53,34);
		System.out.println("Ascending Order");
		number.stream().sorted().forEach(n->System.out.println(n));
		System.out.println("Descending Order");
		number.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		
	}

}
