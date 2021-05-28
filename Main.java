package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        /*For-Each Loop*/
        for (var fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
