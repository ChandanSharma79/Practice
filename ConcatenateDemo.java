package com.practice;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenateDemo {
	public static void main(String[] args) {
		List<String> lst=Arrays.asList("Student","Student Profile");
		List<String> detail=Arrays.asList("Mark","Remarks");
		Stream <String> stream1=lst.stream();
		Stream <String> stream2=detail.stream();
		Stream.concat(stream1, stream2).forEach(n->System.out.println(n));
				
	}
}
