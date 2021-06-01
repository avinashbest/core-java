package com.avinashbest;

public abstract class UIControl {
    private boolean isEnabled = true;

    public abstract void render();

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
