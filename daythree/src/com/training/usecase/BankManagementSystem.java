package com.training.usecase;
import java.util.Scanner;
public class BankManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerService service = new CustomerService();
        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("Welcome to Standard Chartered Bank");
            System.out.println("==============================");

            System.out.println("1. Add Customer");
            System.out.println("2. Display Customers");
            System.out.println("3. Search Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();
                    System.out.print("Enter Contact : ");
                    String contact = sc.nextLine();
                    System.out.print("Enter Account Type (Savings/Current) : ");
                    String accountType = sc.nextLine();
                    if (!(accountType.equalsIgnoreCase("Savings") ||
                            accountType.equalsIgnoreCase("Current"))) {

                        System.out.println("Invalid Account Type.");
                        break;
                    }
                    System.out.println("Enter salary : ");
                    Double salary = sc.nextDouble();
                    System.out.println("Enter department :");
                    String department = sc.nextLine();
                    System.out.println("Enter location :");
                    String location = sc.nextLine();
                    Customer customer = new Customer();
                    customer.setCustomerName(name);
                    customer.setEmail(email);
                    customer.setAccountType(accountType);
                    customer.setSalary(salary);
                    customer.setDept(department);
                    customer.setLocation(location);
                    customer.setContactNo(contact);
                    try {
                        service.addCustomer(customer);
                    } catch (InvalidNameException e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidEmailException e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidContactNoException e) {
                        System.out.println(e.getMessage());
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case 2:
                        Customer[] customers = service.customers();
                        for(Customer c: customers){
                            System.out.println(c);
                        }
                        break;
                        case 3:
                            System.out.println("Enter Customer ID : ");
                            Integer id = sc.nextInt();
                            try {
                                Customer cust = service.searchCustomer(id);
                            } catch (CustomerNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                case 4:
                    //TODO delete customer operation
                    break;
                    case 5:
                        System.out.println("Thank You!!");
                        break;

                        default:
                            System.out.println("Invalid choice.");


            }
        }while(choice != 5);

        sc.close();
    }
}
