package com.avinashbest;

public class TaxReport {
    private TaxCalculator calculator;

    /*Method Injection*/
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
