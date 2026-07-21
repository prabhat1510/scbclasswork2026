package com.training.daytwo.inheritanceex;

//public class Child3 extends Child1,Child2 {
public class Child3 extends Child1 implements InterfaceA {
    @Override
    public void display() {
        System.out.println("Child3");
    }
}
