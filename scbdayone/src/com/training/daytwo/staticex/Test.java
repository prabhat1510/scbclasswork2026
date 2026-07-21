package com.training.daytwo.staticex;

public class Test {
    public static void main(String[] args) {
        Employee emp1= new Employee(101,"John");
        emp1.display();
        Employee emp2= new Employee(102,"Jane");
        emp2.display();
        System.out.println(Employee.counter);
        //display2();

    }
    public void display2(){
        System.out.println("display2");
        display3();
    }
    public static void display3(){
        System.out.println("display3");
    }
}
