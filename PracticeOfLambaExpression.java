package com.practice;
import java.util.ArrayList;
import java.util.function.*;

class Employee1 {
    String name;
    int salary;
    int age;

    Employee1(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}

public class PracticeOfLambaExpression {
    public static void main(String[] args) {
        ArrayList<Employee1> emplist = new ArrayList<>();
        emplist.add(new Employee1("Sourav", 50000, 22));
        emplist.add(new Employee1("Mohit", 60000, 35));
        emplist.add(new Employee1("Ankit", 74400, 24));

        Function<Employee1, Integer> calculateBonus = emp -> (emp.salary * 10) / 100;
        Predicate<Integer> isBonusEligible = bonus -> bonus >= 5000;
        Consumer<Employee1> printEmployee = emp -> 
            System.out.println("Name: " + emp.name + " | Salary: " + emp.salary);

        for (Employee1 e : emplist) {
            int bonus = calculateBonus.apply(e);
            if (isBonusEligible.test(bonus)) {
                printEmployee.accept(e);
                System.out.println("Your Bonus is"+bonus);
            }
        }
    }
}
