package com.avinashbest;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);

        int wage1 = employee.calculateWage(10);
        int wage2 = employee.calculateWage();

        System.out.println(wage1);
        System.out.println(wage2);
    }
}
