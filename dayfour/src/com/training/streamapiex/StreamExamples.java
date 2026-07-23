package com.training.streamapiex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        System.out.println("***********************Objects example in stream ************************************");
        Order orderOne = new Order("AUD", 15000.00);
        Order orderTwo = new Order("INR", 5000.00);
        Order orderThree = new Order("USD", 150000.00);
        Order orderFour = new Order("EUR", 5000.00);
        Order orderFive = new Order("AUD", 8000.00);
        Order orderSix = new Order("EUR", 5001.00);
        Order orderSeven = new Order("EUR", 1000.00);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(orderOne);
        orderList.add(orderTwo);
        orderList.add(orderThree);
        orderList.add(orderFour);
        orderList.add(orderFive);
        orderList.add(orderSix);
        orderList.add(orderSeven);

        System.out.println("*************Example of filter() function********************");
        orderList.stream() //stream created
                .filter(o->o.getAmount() > 5000)//Intermediate Operation
                .sorted(Comparator.comparing(Order::getAmount).reversed())//Intermediate Operation
                .forEach(System.out::println);//terminal operation

        System.out.println("*************Example of old way of creating custom comparator function*******************");
        orderList.stream()
                .filter(o->o.getAmount() > 5000)
                .sorted(new OrderAmountComparator())
                .forEach(System.out::println);

        System.out.println("*************Example of map() function********************");
        List<Double> listOfEUROrderAmount= orderList.stream()
                .filter(o -> o.getCurrency().equals("EUR"))//Intermediate Operation
                .map(Order::getAmount)//Intermediate Operation
                //.forEach(System.out::println);
                .collect(Collectors.toList());//Terminal Operation

        System.out.println(listOfEUROrderAmount);
        System.out.println("*************Example of reduce() function********************");
        Double totalAmountinEuro=orderList.stream()
                .filter(o -> o.getCurrency().equals("EUR"))
                .reduce(0.0,(sum,o)->sum+o.getAmount(),Double::sum);
        System.out.println(totalAmountinEuro);


    }
}
