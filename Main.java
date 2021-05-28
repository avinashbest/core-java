package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        String message = greetUser("Avinash", "Kumar");
        System.out.println(message);
    }

    public static String greetUser(String firstname, String lastName) {
        return "Hello " + firstname + " " + lastName;
    }
}
