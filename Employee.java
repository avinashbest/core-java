package com.avinashbest;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    /*Static fields belongs to class, they are independent of objects.*/
    public static int numberOfEmployees;

    /*CONSTRUCTORS*/
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    /*Static Methods belongs to class, they are independent of objects.*/
    public static void printNumberOfEmployee() {
        System.out.println("Number of Employee = " + numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    /*METHOD OVERLOADING*/
    public int calculateWage() {
        return calculateWage(0);
    }

    /*SETTERS*/
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary can't be 0 or less.");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate can't be 0 or less.");
        }
        this.hourlyRate = hourlyRate;
    }

    /*GETTERS*/
    private int getBaseSalary() {
        return this.baseSalary;
    }

    private int getHourlyRate() {
        return this.hourlyRate;
    }
}
