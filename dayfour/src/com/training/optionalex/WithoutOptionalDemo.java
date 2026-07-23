package com.training.optionalex;

public class WithoutOptionalDemo {
    public static void main(String[] args) {
        /*String s = null;
        System.out.println(s.length());*/
        Integer[] nums = new Integer[10];
        int num = nums[4].intValue();
        System.out.println(num);
    }
}
