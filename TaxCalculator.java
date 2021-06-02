package com.avinashbest;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.3;
    }

}
