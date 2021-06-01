package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        /*Polymorphism in Action: Each control object is taking different forms during runtime.*/
        for (var control : controls) {
            control.render();
        }
    }

}