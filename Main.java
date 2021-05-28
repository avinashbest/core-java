package com.avinashbest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        boolean moduloFive = (number % 5) == 0;
        boolean moduloThree = (number % 3) == 0;

        if (moduloFive && moduloThree) {
            System.out.println("FizzBuzz");
        } else if (moduloFive) {
            System.out.println("Fizz");
        } else if (moduloThree) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
