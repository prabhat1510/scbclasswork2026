package com.training.functionalinterfaceex;

@FunctionalInterface
public interface MyFunctionalInterface {
    //One abstract method only then this interface will be considered as functional interface
    public void  sayHello();
    public static void displayMsg(String msg){
        System.out.println(msg);
    }
    public default void displayInfo(){
        System.out.println("Hello World");
    }
}
