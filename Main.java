package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        int temperature = 32;
        if (temperature > 32) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temperature > 20) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }
        /*Simplifying if-statement*/
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000) {
            hasHighIncome = true;
        } else {
            hasHighIncome = false;
        }
        /*Above Expression can be simplified by professional be like*/
        int income = 120_000;
        boolean hasHighIncome = income > 100_000;
    }
}
