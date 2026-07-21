package com.training.daytwo.inheritanceex;

public class Child4 extends Father implements Mother,Sister {
    @Override
    public void motherMethod() {
        System.out.println("Child4");
    }
}
