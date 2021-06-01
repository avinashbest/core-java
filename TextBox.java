package com.avinashbest;

public class TextBox extends UIControl {
    private String text = "";//field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void clear() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

}
