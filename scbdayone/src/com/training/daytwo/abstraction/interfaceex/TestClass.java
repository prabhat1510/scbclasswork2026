package com.training.daytwo.abstraction.interfaceex;

public class TestClass implements Test{
    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void printInfo() {
        System.out.println("printInfo");
    }
}
