package com.practice.universitymanagementsystem;
class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name "+name+", Age "+age);
	}
}
class  Student extends Person {
	String course;
	Student(String name,int age,String course) {
		super(name,age);
		this.course=course;
	}
	void display() {
		System.out.println("Student: "+name+" ,Age: "+age+" ,Course:"+course);
		}
	void takeExam() {
		System.out.println(name+ " is writting an exam");
	}
}
class Teacher extends Person {
	String lecture;
	Teacher(String name,int age,String lecture) {
		super(name,age);
		this.lecture=lecture;
	}
	void takeLecture() {
		System.out.println(name+" is teaching "+lecture);
	}
	void display() {
		System.out.println("Name "+name+" ,Age "+age+" Lecture "+lecture);
	}
}
class Staff extends Person {
	String department;
	Staff(String name,int age,String department) {
		super(name,age);
		this.department=department;
	}
	void display() {
		System.out.println("Name "+name+" ,Age "+age+" department "+department);
	}
	void manageWork() {
		System.out.println(name+" is managing "+department+ " department");
	}
}
public class UniversityManagementSystem {
	public static void main(String[] args) {
		System.out.println("University Management System");
		Person[] people = { new Student("Alice",20,"ComputerScience"),
				new Teacher("Sarimol",35,"java"),
				new Staff("Robert",35,"HR")
		};
		for(Person p:people) {
			p.display();
			if(p instanceof Student) {
				((Student)p).takeExam();
			} else if(p instanceof Teacher) {
				((Teacher)p).takeLecture();
			} else if(p instanceof Staff) {
				((Staff)p).manageWork();
			}
			System.out.println();
		}
	}

}
