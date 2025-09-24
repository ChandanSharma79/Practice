package com.practice;
import java.util.Arrays;
import java.util.List;
public class MapDemo1 {
	public static void main(String[] args) {
		List<String> namelst = Arrays.asList("Hello","How are you");
		namelst.stream().map(n -> n.length()).forEach(n -> System.out.println(n));
	}

}
