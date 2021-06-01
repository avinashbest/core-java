package com.avinashbest;

public class UIControl {
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    /*GETTER*/
    public boolean isEnabled() {
        return isEnabled;
    }
}
