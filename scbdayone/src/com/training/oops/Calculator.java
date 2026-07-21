package com.training.oops;

public class Calculator{
    void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }

    int sub(int a,int b){
        int subResult = a-b;
        System.out.println(subResult);
        return subResult;
    }
    void display(){
        System.out.println("Inside method display return type void");
    }
    void printInfo(String message){
        System.out.println(message);
    }

}
