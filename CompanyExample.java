package com.practice;
class Employe {
	String name;
	String id;
	double salary;
	public Employe(String name,String id,double salary) {
		this.name = name;
		this.id = id;
		this.salary=salary;
	}
	public void displayEmploye() {
		System.out.println("Name: "+name+" Id: "+id+" salary: "+salary);
	}
}
class Manager extends Employe {
	int teamSize;
	Manager(String name,String id,double salary,int teamSize){
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	public void displayManager() {
		System.out.println(name+" is managing team of "+teamSize);
	}
}
class Developer extends Employe {
		String programmingLanguage;
		Developer(String name,String id,double salary,String programmingLanguage){
			super(name,id,salary);
			this.programmingLanguage=programmingLanguage;
		}
		public void work() {
			System.out.println(name+" is writting code in "+programmingLanguage);
		}
}
class Intern extends Employe {
	int duration;
	Intern(String name,String id,double salary,int duration){
		super(name,id,salary);
		this.duration=duration;
	}
	public void learn() {
		System.out.println(name+ " doing intern for "+duration+" month");
	}
}
public class CompanyExample {
	public static void main(String[] args) {
		Manager m = new Manager("Chandan","C01",900000,5);
		m.displayEmploye();
		m.displayManager();
		Developer d = new Developer("Rohit","C02",1000000,"Java");
		d.displayEmploye();
		d.work();
		Intern i = new Intern("Aditya","I01",10000,3);
		i.displayEmploye();
		i.learn();
		}

}
