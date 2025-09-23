package com.practice;
import java.util.ArrayList;
import java.util.function.*;

class Employee{
	String name;
	String id;
	int salary;
	Employee(String name,String id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

}

public class EmployeeBonus {
	public static void main(String[] args) {
		Employee emp = new Employee("Chandan","BAI",70000);
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Mohit","BAI79",80000));
		emplist.add(new Employee("Aditya","BAI63",56000));
		emplist.add(emp);
		Function<Employee,Integer> f = e -> {
			int sal = e.salary;
			if(sal < 60000) 
				return (sal*10/100);
			 else if(sal > 60000 && sal <= 70000) 
				return (sal*20/100);
			else 
				return (sal*30/100);
			
		};
		for(Employee a:emplist) {
			int bonus = f.apply(a);
			System.out.println(a.name+" "+a.salary);
			System.out.println("Bonus is: "+bonus);
		}
		
	}

}
