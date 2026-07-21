package com.training.usecaseone;

public class Test {
    public static void main(String[] args) {
        Customer[] customers = new Customer[2];
        Customer cust1 = new Customer(11,"Sukhdev","sukhi@paaji.com","911122255","savings");
        //call validate
        validate(cust1);
        customers[0]=cust1;
        Customer cust2 = new Customer(12,"Ansh","ansh@abcd.com","911442255","savings");
        customers[1]=cust2;
        for(Customer c:customers){
            System.out.println(c);
        }

    }

    private static void validate(Customer cust) {
        //
    }
}
