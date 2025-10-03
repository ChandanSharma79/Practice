package com.practice.abstract1;
abstract class Course {
	String courseName;
	Course(String courseName){
		this.courseName=courseName;
	}
	abstract void courseContent();
	abstract void courseDuration();
	
}
class JavaCourse extends Course {
	JavaCourse(){
		super("Java Programming");
	}
	public void courseContent() {
		System.out.println("OOPS,Collection,Streams,Lambda,Fundamentals");
	}
	public void courseDuration() {
		System.out.println("Duration: 3 Months");
	}
	
}
class PythonCourse extends Course {
	PythonCourse(){
		super("Python Programming");
	}
	public void courseContent() {
		System.out.println("OOPS,Constructor,Pandas,Numpy");
	}
	public void courseDuration() {
		System.out.println("Duration: 3 Months");
	}
	
}
public class OnlineCourseSystem {
	public static void main(String[] args) {
		Course c1 = new JavaCourse();
		c1.courseContent();
		c1.courseDuration();
		Course c2 = new PythonCourse();
		c2.courseContent();
		c2.courseDuration();
		
	}

}
