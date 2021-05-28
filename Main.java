package com.avinashbest;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*FOR LOOPS*/
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, Java!");
        }
        /*WHILE LOOPS: USED WHEN DON'T KNOW HOW MANY TIMES WE NEED TO EXECUTE CODE*/
        int i = 0;
        while (i < 5) {
            System.out.println("Hello, Java!");
            i++;
        }

        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scan.next().toLowerCase(Locale.ROOT);
            System.out.println(input);
        }
        /*DO-WHILE LOOPS: SIMILAR TO WHILE-LOOP BUT IT EXECUTES ATLEAST 1 TIME*/
        do {
            System.out.print("Input: ");
            input = scan.next().toLowerCase(Locale.ROOT);
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
