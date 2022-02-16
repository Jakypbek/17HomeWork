package com.company;

public class Shark extends Animal {

    public void attack() {
        System.out.println("Shark is attacking");
    }

    @Override
    public void someMethod() {
        super.someMethod();
    }
}