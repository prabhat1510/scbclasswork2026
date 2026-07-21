package com.training.usecaseone;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerService service = new CustomerService();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("Standard Chartered Bank");
            System.out.println("==============================");

            System.out.println("1. Add Customer");
            System.out.println("2. Display Customers");
            System.out.println("3. Search Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    if(!name.matches("[A-Za-z ]+")) {

                        System.out.println("Invalid Name.");
                        break;
                    }

                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();

                    if(!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

                        System.out.println("Invalid Email.");
                        break;
                    }

                    System.out.print("Enter Contact : ");
                    String contact = sc.nextLine();

                    if(!contact.matches("\\d{10}")) {

                        System.out.println("Contact should contain exactly 10 digits.");
                        break;
                    }

                    System.out.print("Enter Account Type (Savings/Current) : ");
                    String accountType = sc.nextLine();

                    if(!(accountType.equalsIgnoreCase("Savings") ||
                            accountType.equalsIgnoreCase("Current"))) {

                        System.out.println("Invalid Account Type.");
                        break;
                    }

                    service.addCustomer(name,
                            email,
                            contact,
                            accountType);

                    break;

                case 2:

                    service.displayCustomers();

                    break;

                case 3:

                    System.out.print("Enter Customer Id : ");

                    int id = sc.nextInt();

                    service.searchCustomer(id);

                    break;

                case 4:

                    System.out.print("Enter Customer Id : ");

                    int deleteId = sc.nextInt();

                    service.deleteCustomer(deleteId);

                    break;

                case 5:

                    System.out.println("Thank You!!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while(choice != 5);

        sc.close();

    }
}