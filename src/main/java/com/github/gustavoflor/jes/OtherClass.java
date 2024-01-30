package com.github.gustavoflor.jes;

import com.github.gustavoflor.jes.main.MyClass;

public class OtherClass {

    // Executing a public method outside the main package
    public void doSomething(final MyClass myClass) {
        myClass.setState(7);
    }

}
