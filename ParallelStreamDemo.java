package com.practice;

import java.util.Arrays;
import java.util.List;

class Student {
	String studentName;
	int studentScore;
	Student(String studentName,int studentScore){
		this.studentName=studentName;
		this.studentScore=studentScore;
		}
	public String getName() {
		return studentName;
	}
	public int getScore() {
		return studentScore;
	}
}
public class ParallelStreamDemo {
	public static void main(String[] args) {
		List<Student> studentDetails = Arrays.asList(new Student("Chandan",89),
											new Student("Rounak",76),
											new Student("Janvi",89),
											new Student("Rahul",65),
											new Student("Jiya",87),
											new Student("Mohit",97),
											new Student("Raj",99)
											);
		System.out.println("Without using streamParallel");
		studentDetails.stream().filter(n->n.studentScore>80).forEach(stu->System.out.println("Name "+stu.getName()+" Score "+stu.getScore()));
		System.out.println("Using streamParallel");
		studentDetails.parallelStream().filter(n->n.studentScore>80).forEach(stu->System.out.println("Name "+stu.getName()+" Score "+stu.getScore()));
	
	}

}
