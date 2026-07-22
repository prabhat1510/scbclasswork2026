package com.training.functionalinterfaceex;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CalculatorDemo {
    public static void main(String[] args) {
        //(a,b)->a+b
        Calculator add = (a,b) -> a+b;
        System.out.println(add.calculate(15,10));
        Calculator sub = (a,b) -> a-b;
        System.out.println(sub.calculate(15,10));
        Calculator mul = (a,b) -> a*b;
        System.out.println(mul.calculate(15,10));

        Function<String,String> func ;
        Consumer<String> consumer ;
        Predicate<String> predicate;
        Supplier<String> supplier;

    }
}
