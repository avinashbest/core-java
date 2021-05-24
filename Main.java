package com.avinashbest;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World" + "!!";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.trim()) ; /*To remove unnecessary space.*/

        /*NOTE: IN JAVA, ALL THE METHOD WHICH PERFORM OPERATION ON STRING RETURNS A NEW STRING.*/
        /*ALL THE STRING IN JAVA ARE IMMUTABLE*/
        System.out.println(message);
    }
}
