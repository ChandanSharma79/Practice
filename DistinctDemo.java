package com.practice;
import java.util.List;
import java.util.Arrays;

public class DistinctDemo {
	public static void main(String[] args) {
		List<String> vehiclelst = Arrays.asList("Bike","Bike","Car","Car","Bus","Scooter");
        vehiclelst.stream().distinct().forEach(n->System.out.println(n));
        long count=vehiclelst.stream().distinct().count();
        System.out.println("Unique Vehicle are:"+count);
        System.out.println("Below Vehicle are Available for Booking");
        vehiclelst.stream().distinct().limit(3).forEach(n->System.out.println(n));
        
	}

}
