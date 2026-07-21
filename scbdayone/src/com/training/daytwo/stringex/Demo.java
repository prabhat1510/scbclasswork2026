package com.training.daytwo.stringex;

public class Demo {
    public static void main(String[] args) {
             //        012345678910  length is 11
        String hello ="Hello World";
        System.out.println(hello.length());
        System.out.println(hello.charAt(7));
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());
        String hello2=hello.concat(" How are you all doing ?");
        System.out.println(hello2);
        System.out.println(hello);

    }
}
