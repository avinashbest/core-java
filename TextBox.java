package com.avinashbest;

public class TextBox extends UIControl{
    private String text = "";//field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

}
