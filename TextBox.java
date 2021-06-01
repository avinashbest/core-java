package com.avinashbest;

public class TextBox extends UIControl {
    private String text = "";//field

    /*Constructor*/
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString() {
        return this.text;
    }

    public void clear() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

}
