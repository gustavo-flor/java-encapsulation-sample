package com.github.gustavoflor.jes;

import com.github.gustavoflor.jes.main.MyClass;

public class SubClass extends MyClass {

    // Overriding a public method outside the main package
    @Override
    public void setState(int state) {
        super.setState(state);
    }

    // Getting a protected attribute from MyClass outside the main package
    public boolean isTen() {
        return state == 10;
    }

}
