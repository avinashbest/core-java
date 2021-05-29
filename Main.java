package com.avinashbest;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();

        employee.setBaseSalary(50_000);
        System.out.println(employee.getBaseSalary());

        employee.setHourlyRate(100);
        System.out.println(employee.getHourlyRate());

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
