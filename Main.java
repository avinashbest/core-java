package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);

        x = 1;
        int y = x++; // post-increment
        System.out.println(x + "\t" + y);
        y = ++x; //pre-increment
        System.out.println(x + "\t" + y);

        x += 2; //x = x + 2
        System.out.println(x);
        x -= 2; //x = x - 2
        System.out.println(x);
        x *= 2; //x = x * 2
        System.out.println(x);
        x /= 2; //x = x / 2
        System.out.println(x);
        x %= 2; //x = x % 2
        System.out.println(x);
    }
}
