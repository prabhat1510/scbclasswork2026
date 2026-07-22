package com.training.functionalinterfaceex;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface myInterface=new MyInterfaceImpl();
        myInterface.sayHello(10);
        myInterface.sayHello("God knows");
        myInterface.sayHello();
    }
}
