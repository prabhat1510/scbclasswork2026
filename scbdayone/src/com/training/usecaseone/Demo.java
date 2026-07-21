package com.training.usecaseone;

import java.util.Scanner;

/**
 * Multiple Line Comments
 * Describe about the class
 */
public class Demo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        while(true){
        System.out.println("Welcome to Standard Chartered Bank");
        System.out.println("Please enter your choice");
        System.out.println("1 for Add new Customer");
        System.out.println("2 for Display Customers");
        System.out.println("3 for Search Customer");
        System.out.println("4 for Delete Customer");
        System.out.println("5 for Exit the bank application");
        //Scanner class object is create below which is referred by variable sc
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the customer details to be added");
                break;
            case 2:
                System.out.println("Customers Displayed");
                break;
            case 3:
                System.out.println("Customer Found");
                break;
            case 4:
                System.out.println("Customer Deleted");
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
        }
    }

    /**
     * Below method is adding two numbers of
     * integer type
     * @param a
     * @param b
     * @return sum of a and b
     */
    int addition(int a,int b){
        return a+b;
    }
}
