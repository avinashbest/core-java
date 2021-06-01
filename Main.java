package com.avinashbest;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);
    }

    /*Upcast an Object*/
    private static void show(UIControl control) {
        /*Downcast an Object*/
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }

}