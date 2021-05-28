package com.avinashbest;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Input: ");
            input = scan.next().toLowerCase(Locale.ROOT);
            if (input.equals("pass")) {
                continue;/*moves control to the beginning of  the loop*/
            }
            if (input.equals("quit")) {
                break;/*break out of the loop*/
            }
            System.out.println(input);
        }
    }
}
