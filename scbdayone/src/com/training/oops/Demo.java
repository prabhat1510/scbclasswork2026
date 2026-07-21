package com.training.oops;

public class Demo {
    public static void main(String[] args) {
        DisplayInformation displayInformation = new DisplayInformation();
        displayInformation.display();
        //displayInformation.display("Hello Shaurya");
        int num= displayInformation.display("Ishan "," is good batsman");
        System.out.println(num);
    }
}
