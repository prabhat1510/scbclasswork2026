package com.training.functionalinterfaceex.methodref;

import java.util.ArrayList;
import java.util.List;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = (s)-> System.out.println(s);
        Printable printable1 = System.out::println;//Method reference of println
        printable.print("Hello All ");
        printable1.print("Hello");
        Customer customer = new Customer();
        customer.setCustId(1111);
        customer.setCustName("Ansh Sethi");
        System.out.println(customer.getCustId());
        Customer customer1 = new Customer();
        customer1.setCustId(1112);
        customer1.setCustName("Shaurya Kapoor");
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customer1);
        customerList.add(customer);
        customerList.forEach(System.out::println);
        System.out.println("*****************");
        //customerList.forEach(customer::getCustName);
    }
}
