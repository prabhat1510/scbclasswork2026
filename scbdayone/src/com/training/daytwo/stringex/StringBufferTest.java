package com.training.daytwo.stringex;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Good Afternoon All!!");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        Object obj = new StringBuffer().append("Good Afternoon All!!");
        System.out.println(sb.toString());
        //Integer num = new Integer(111);
    }
}
