package com.github.gustavoflor.jes.main;

public class OtherClass {

    // Executing a public method inside the main package
    public void doSomething(final MyClass myClass) {
        myClass.setState(3);
    }

    // Executing a default method inside the main package
    public void doAnotherThing(final MyClass myClass) {
        myClass.isZero();
    }

    // Handling a protected property inside the main package
    public void doOtherThing(final MyClass myClass) {
        myClass.state = 5;
    }

}
