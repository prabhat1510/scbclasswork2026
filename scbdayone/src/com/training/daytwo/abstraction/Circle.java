package com.training.daytwo.abstraction;

public class Circle extends Shape {
    double radius;
    public Circle(String color,double radius) {
        super(color);
        System.out.println("Inside Circle constructor");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}
