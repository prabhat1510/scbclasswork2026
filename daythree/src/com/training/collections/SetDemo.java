package com.training.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("John");
        set.add("Jack");
        set.add("Ben");
        set.add("Bella");
        set.add("Ben");
        System.out.println(set);

    }
}
