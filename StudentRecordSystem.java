package com.practice.studentrecordsystem;
class Student {
	private String studentName;
	private int rollNo;
	private double marks;
	Student(String studentName,int rollNo,double marks) {
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		if(marks>0 && marks<100) {
			this.marks=marks;
			System.out.println("Marks Updated");
		} else {
			System.out.println("Invalid Marks");
		}
	}
	public void display() {
		System.out.println("Student Name "+studentName+" ,rollNo "+rollNo+" ,Marks: "+marks);
	}
}

public class StudentRecordSystem {
	public static void main(String[] args) {
		Student s = new Student("Mohit",356,90);
		s.getMarks();
		s.setMarks(70);
		s.display();
	}
}
