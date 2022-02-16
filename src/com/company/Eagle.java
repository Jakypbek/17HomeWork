package com.company;

public class Eagle extends Animal{

    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void someMethod() {
        super.someMethod();
    }
}

