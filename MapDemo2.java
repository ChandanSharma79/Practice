package com.practice;
import java.util.List;
import java.util.Arrays;

public class MapDemo2 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		number.stream().map(n->n*3).forEach(nm->System.out.println(nm));
		
	}

}
