package com.practice;
interface Shape {
	int length=35;
	int width=40;
	default void rectangle() {
		System.out.println("This is a Rectangle");
	}
	void circle();
	static void Triangle() {
		System.out.println(Shape.length);
	}
}

public class InterfaceDemo implements Shape {
	public void circle() {
		System.out.println("This is a circle");
	}
	public static void main(String[] args) {
		InterfaceDemo ID = new InterfaceDemo();
		ID.rectangle();
		ID.circle();
		Shape.Triangle();
	}
	

}
