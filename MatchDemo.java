package com.practice;
import java.util.Set;
import java.util.HashSet;
public class MatchDemo {
	public static void main(String[] args) {
		Set<String> items = new HashSet<String>();
		items.add("One Apple");
		items.add("One Banana");
		items.add("Three pineapple");
		items.add("Two Orange");
		//AnyMatch
		boolean result=items.stream().anyMatch(value->{return value.startsWith("One");});
		System.out.println(result);
		//AllMatch
		boolean result1=items.stream().allMatch(value->{return value.startsWith("One");});
		System.out.println(result1);
		//NoneMatch
		boolean result2=items.stream().noneMatch(value->{return value.startsWith("One");});
		System.out.println(result2);
	}

}
