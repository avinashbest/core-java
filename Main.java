package com.avinashbest;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();

        employee.setBaseSalary(50_000);
        employee.setHourlyRate(100);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
