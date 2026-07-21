package com.training.daytwo.superex;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car(150,2500);
        car.displaySuperClassMethod();
        Car car2 = new Car(2500);
        car2.displaySuperClassMethod();
    }
}
