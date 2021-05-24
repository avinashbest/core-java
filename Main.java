package com.avinashbest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.print("Name: ");
//        String name = scanner.next(); //returns the next token
        String name = scanner.nextLine().trim(); //returns next line
        System.out.println("You are " + age);
        System.out.println("Your name " + name);
    }
}
