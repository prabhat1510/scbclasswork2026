package com.training.daytwo.staticex;

public class Employee {
    int id;
    String name;
    static int counter;
    static{
        System.out.println("Static initialization");
        counter=0;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        counter++;
    }
    void display(){
        System.out.println("Total number of objects are "+counter);
    }
}
