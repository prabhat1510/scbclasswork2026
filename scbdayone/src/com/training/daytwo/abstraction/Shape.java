package com.training.daytwo.abstraction;

public abstract class Shape {
    String color;
    //abstract double area();
    double area(){
        System.out.println("Inside shape area method");
        return 0;
    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
