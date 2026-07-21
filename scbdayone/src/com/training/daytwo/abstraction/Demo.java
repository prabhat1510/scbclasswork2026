package com.training.daytwo.abstraction;

import com.training.daytwo.methodoverriding.Square;

public class Demo {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Circle c = new Circle("yellow",4);
        System.out.println(c.area());
        Shape s = new Circle("red",4);
        System.out.println(s.area());

    }
}
