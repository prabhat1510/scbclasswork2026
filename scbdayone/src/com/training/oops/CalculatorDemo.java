package com.training.oops;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1,2);
        int result = c.sub(1,2);
        System.out.println(result);
        c.display();
        c.printInfo("Hello Good Afternoon All !!");
    }
}
