package com.practice;
import java.util.function.*;
public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> str = s -> System.out.println(s);
		str.accept("Hello");
	}

}
