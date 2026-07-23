package com.training.streamapiex;

import java.util.Comparator;
//custom comparator
public class OrderAmountComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getAmount().compareTo(o2.getAmount());
    }
}
