package com.pattern;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class IndiaSquad {
	public static void main(String[] args) {
		System.out.println("Top XI");
		List<String> Batters = Arrays.asList("Rohit Sharma","Virat Kohli","Shubham Gill","Iyer","Abhishek");
		List<String> Allrounders = Arrays.asList("Jadeja","Hardik Pandeya","Axar Patel");
		List<String> Bowler = Arrays.asList("Bumrah","Kuldeep","Siraj");
		List<List<String>> Squad = Arrays.asList(Batters,Allrounders,Bowler);
		List<String> TopXI=Squad.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(TopXI);
	}

}
