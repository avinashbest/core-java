package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        /*Implicit Casting*/
        /*byte > short > int > long > float > double*/
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        /*Explicit Casting*/
        double a = 1.1;
        int b = (int) (a + 2);
        System.out.println(b);
        /*Parsing String in Integer*/
        String str = "123";
        System.out.println(Integer.parseInt(str));
    }
}
