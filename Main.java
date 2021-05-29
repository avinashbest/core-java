package com.avinashbest;

public class Main {
    public static void main(String[] args) {
//        TextBox textBox1 = new TextBox();
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}
