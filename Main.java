package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = box1;
        /*It is an integer value which is calculated based upon the address of the object*/
        /*If 2 or more objects having same reference then their hashCode also be same*/
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        /*Comparing 2 objects bases on their hashCode associated with them*/
        System.out.println(box1.equals(box2));
        /*toString() method will return the String representation of an object*/
        System.out.println(box1.toString());
    }

}