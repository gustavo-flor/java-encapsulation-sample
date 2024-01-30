package com.github.gustavoflor.jes.main;

public class SubClass extends MyClass {

    // Overriding a public method inside the main package
    @Override
    public void setState(int state) {
        super.setState(state);
    }

    // Getting a protected attribute from MyClass inside the main package
    public boolean isTen() {
        return state == 10;
    }


    // Overriding a default method inside the main package
    @Override
    boolean isZero() {
        return super.isZero();
    }
}
