package com.avinashbest;

public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee(50_000, 100);
        var employee2 = new Employee(50_000);

        int wage1 = employee1.calculateWage(10);
        int wage2 = employee2.calculateWage();

        System.out.println(wage1);
        System.out.println(wage2);
    }
}
