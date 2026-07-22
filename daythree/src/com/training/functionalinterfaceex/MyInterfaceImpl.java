package com.training.functionalinterfaceex;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello All!! Please remain awake");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name+"!! Please remain awake");
    }

    @Override
    public void sayHello(int age) {
        System.out.println("Hello your age is "+age+"!! Please remain awake");
    }
}
