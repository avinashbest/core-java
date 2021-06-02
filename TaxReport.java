package com.avinashbest;

public class TaxReport {
    private TaxCalculator calculator;

    /*Constructor Injection*/
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
