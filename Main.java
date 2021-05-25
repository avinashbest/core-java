package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        int income = 120_000;
        String className;
        if (income > 100_000) {
            className = "First";
        } else {
            className = "Economy";
        }
        /*Simplification can be done as*/
        income = 120_000;
        className = "Economy";
        if (income > 100_000) {
            className = "First";
        }
        /*More Simplification can be done using Ternary Operator*/
        income = 120_000;
        className = (income > 100_000) ? "First" : "Economy";
    }
}
