package com.training.daytwo.abstraction.interfaceex;

public interface Test {
    final int a =10;//public static and final
    void display();//abstract method
    void printInfo();//abstract method
    //Introduced in Java 8 version
    default void displayMessage(){
        System.out.println("Displaying Message");
    }
    static void displayMessage(String  msg){
        System.out.println(msg);
    }
}
