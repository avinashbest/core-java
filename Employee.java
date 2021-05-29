package com.avinashbest;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    /*SETTERS*/
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary can't be 0 or less.");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate can't be 0 or less.");
        }
        this.hourlyRate = hourlyRate;
    }

    /*GETTERS*/
    public int getBaseSalary() {
        return this.baseSalary;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }
}
