package com.avinashbest;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456.789);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(0.1);
        System.out.println(percentage);

        System.out.println(NumberFormat.getCurrencyInstance().format(134343134313L));
    }
}
