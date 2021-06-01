package com.avinashbest;

public class TextBox extends UIControl {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Render TextBox");
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
