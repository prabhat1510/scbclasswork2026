package com.training.daytwo.superex;
//Here Vehicle is super class, base class, or parent class
public class Vehicle {
    int maxSpeed =100;//properties or data members or fields

    public Vehicle() {
    }

    //One argument constructor -- maxSpeed
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    //display is method inside super class
    public void display() {
        System.out.println("maxSpeed: " + this.maxSpeed);

    }
}
