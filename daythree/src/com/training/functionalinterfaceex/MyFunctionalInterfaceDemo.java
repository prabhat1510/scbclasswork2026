package com.training.functionalinterfaceex;

public class MyFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //Below line is using lambda expression to write the
        // implementation of abstract method of a functional interface
        MyFunctionalInterface myFunctionalInterface = () ->System.out.println("hello");
        myFunctionalInterface.sayHello();
        MyFunctionalInterface myFunctionalInterface1 = ()->System.out.println("hello all");
        myFunctionalInterface1.sayHello();
    }
}
