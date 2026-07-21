package com.training;

public class DataTypeExample {
    public static void main(String[] args) {
        int age = 0;
        System.out.println(age);
        age=18;
        System.out.println(age);
        char ch = 'a'; //2 bytes -- 16 bits
        System.out.println(ch);
        boolean b = true;
        System.out.println(b);
        short s = 1;//2bytes -- 16bits
        System.out.println(s);
        long l = 111111;// 8bytes - 64 bits
        System.out.println(l);
        float f = 1.1f;//4bytes -- 32 bits
        System.out.println(f);
        double d = 11.50; //8 bytes -- 64 bits
        System.out.println(d);
        byte b1 = 1;//1 byte -- 8 bits
        System.out.println(b1);
        boolean b2 = true;//1 bit(virtually)

        //Typecasting -- Widening
        int i = 1000;//4 bytes -- 32 bits
        long le =i;
        float f1 = l;
        //short s1 = i;//2 bytes
        double d1 = 32768.50;
        short s2 = (short) d1;
        System.out.println(s2);
        System.out.println(d1);
        int  number= 999910611;
        float f3 = (float)number;
        System.out.println(f3);


    }
}
