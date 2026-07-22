package com.training.customexceptionexample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age :");
        int age = sc.nextInt();
        //using try and catch block we are handling an exception thrown from validateAge method
        try {
            validateAge(age);//call to a method
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void validateAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age is less than 18 ");//
        }else{
            System.out.println("Age is greater than 18");
        }
    }
}
