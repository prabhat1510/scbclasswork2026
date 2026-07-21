package com.training.daytwo.stringex;

public class StringExample {
    /**
     * If two objects are equal according to the equals(object) method, they
     * must return the same integer value from the hashCode() method. Conversely,
     * objects with the same hash code are not required to be equal
     * 1. If obj1.equals(obj2) is true, then obj1.hashCode() == obj2.hashCode() must be
     *    true
     * 2. If obj1.hashCode() == obj2.hashCode() is true. obj1.equals(obj2) can be true
     *    or false ( this is know as a hash collision)
     * 3. If obj1.hashCode() == obj2.hashCode() is true, then obj1.equals(obj2) can be false
     * 4. If you override equals(), you must override hashCode() using the exact same fields
     * @param args
     */
    public static void main(String[] args) {
        String s1 ="A";
        String s2 ="A";
        String s3 =new String("A");
        String s4 =new String("A");
        String s5="a";
        String s6=new String("b");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println("********************");
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println("********************");
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
    }
}
