package com.github.gustavoflor.jes.main;

public class MyClass {

    protected int state;

    public void setState(int state) {
        this.state = state;
    }

    private int getState() {
        return state;
    }

    boolean isZero() {
        return getState() == 0;
    }
}
