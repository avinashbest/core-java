package com.avinashbest;

public class Employee {
    public int baseSalary;
//    public int extraHours;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
