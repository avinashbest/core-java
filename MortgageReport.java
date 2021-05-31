package com.avinashbest;

import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = Main.calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            double balance = Main.calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
