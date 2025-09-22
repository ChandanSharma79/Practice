package com.pattern;
import java.util.function.*;
import java.util.ArrayList;

class Employee1 {
    String name;
    int Salary;
    int experience;

    Employee1(String name, int Salary, int experience) {
        this.name = name;
        this.Salary = Salary;
        this.experience = experience;
    }
}

public class Employee { 
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Chandan", 50000, 3);

        // Fixed predicate logic
        Predicate<Employee1> pr = e -> (e.Salary > 30000 && e.experience > 2);
        System.out.println(pr.test(emp)); // Should print true

        ArrayList<Employee1> a = new ArrayList<Employee1>();
        a.add(new Employee1("Hello", 45000, 4));
        a.add(new Employee1("Sukhan", 50000, 6));
        a.add(new Employee1("Aditya", 30000, 3));

        for (Employee1 e : a) {
            if (pr.test(e)) {
                System.out.println("Name: " + e.name);
            }
        }
    }
}
