package com.training.wrapperclasses;

public class Demo {
    public static void main(String[] args) {
        Integer number =15;
        int n=number;
        System.out.println(number instanceof Integer);
        String numstr =String.valueOf(number);
        System.out.println(numstr instanceof String);
        String numstr2 ="12234";
        Integer number2 =Integer.valueOf(numstr2);
        System.out.println(number2);
        int no=Integer.parseInt("1546");
        System.out.println(no==1546);
    }
}
