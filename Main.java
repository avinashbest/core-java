package com.avinashbest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10};
        System.out.println(number.length);
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
