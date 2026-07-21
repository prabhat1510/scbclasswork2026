package com.training.daytwo.superex;


//Car class is a child class or sub class or derived class of Super class Vehicle
public class Car extends Vehicle{
    //engineCapacity is data member or property or filed of Car class or object
    int engineCapacity;

    public Car(int engineCapacity){
        this.engineCapacity=engineCapacity;
    }
    //Parameterized or single argument constructor where we are passing maxSpeed
    /*public Car(int maxSpeed) {
        //By using super() and passing maxSpeed we are calling constructor of super class Vehicle
        super(maxSpeed);//We are calling constructor of Super class Vehicle
    }*/
    //Constructor with 2 arguments or 2 parameters
    public Car(int maxSpeed, int engineCapacity) {
        super(maxSpeed);//calling super class constructor using super()
        this.engineCapacity = engineCapacity;
    }
    public void displaySuperClassMethod(){
        super.display();//super class method
        System.out.println("Engine Capacity: " + this.engineCapacity+" MaxSpeed"+ super.maxSpeed);
    }
}
