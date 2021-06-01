package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        /*Compare 2 objects based on the references*/
        System.out.println(point1 == point2);
        /*Compare 2 objects based on the values by Overriding the method*/
        System.out.println(point1.equals(point2));
        /**/
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }

}