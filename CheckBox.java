package com.avinashbest;

//if a class is declared 'final' then no other class can inherit it.
//an example of such type class is String class in java, which is declared as final in its implementation, this is done because Strings in java are immutable.
public final class CheckBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}
