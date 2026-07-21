package com.training.daytwo.methodoverriding;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1= new Square();
        s1.draw();
        Shape s2= new Circle();
        s2.draw();
        Shape s3= new Rectangle();
        s3.draw();
    }
}
