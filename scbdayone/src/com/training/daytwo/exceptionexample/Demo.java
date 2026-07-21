package com.training.daytwo.exceptionexample;

public class Demo {
    public static void main(String[] args) {
        int data;
        try{
            data =10/0;//Exception class object is thrown
            System.out.println(data);

        }catch(ArithmeticException e){ // ArithmeticException is caught or handled
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally block will be executed everytime");
        }
        System.out.println("Hello World");

    }
}
