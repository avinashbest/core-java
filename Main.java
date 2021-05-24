package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.round(1.2F));
        System.out.println(Math.round(1.2));
        System.out.println(Math.ceil(1.2));
        System.out.println(Math.floor(1.2));
        System.out.println(Math.max(200, 300));
        System.out.println(Math.min(200, 300));
        System.out.println(Math.random());//by default return a doubleType random number b/w 0 to 1
        System.out.println(Math.round(Math.random() * 100));
        System.out.println((int) (Math.random() * 100));
    }
}
