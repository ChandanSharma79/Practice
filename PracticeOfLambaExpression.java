package com.practice;
import java.util.ArrayList;
import java.util.function.*;

class Employee {
    String name;
    int salary;
    int age;

    Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}

public class PracticeOfLambaExpression {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee("Sourav", 50000, 22));
        emplist.add(new Employee("Mohit", 60000, 35));
        emplist.add(new Employee("Ankit", 74400, 24));

        Function<Employee, Integer> calculateBonus = emp -> (emp.salary * 10) / 100;
        Predicate<Integer> isBonusEligible = bonus -> bonus >= 5000;
        Consumer<Employee> printEmployee = emp -> 
            System.out.println("Name: " + emp.name + " | Salary: " + emp.salary);

        for (Employee e : emplist) {
            int bonus = calculateBonus.apply(e);
            if (isBonusEligible.test(bonus)) {
                printEmployee.accept(e);
                System.out.println("Your Bonus is"+bonus);
            }
        }
    }
}
