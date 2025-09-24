package com.practice;

import java.util.List;
import java.util.Arrays;


public class MapDemo {
	public static void main(String[] args) {
	List<String> names =Arrays.asList("chandan","mohit","dharshan","aditya","ankit");
	names.stream().map(n -> n.toUpperCase()).forEach(n->System.out.println(n));
}
}
