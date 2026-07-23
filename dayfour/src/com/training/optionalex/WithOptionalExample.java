package com.training.optionalex;


import java.util.Optional;

public class WithOptionalExample {
    public static void main(String[] args) {
        Integer[] nums = new Integer[10];
        Optional<Integer> mayBeInt= Optional.ofNullable(nums[4]);
        if(mayBeInt.isPresent()){
            int num = nums[4].intValue();
            System.out.println(num);
        }else{
            System.out.println("int value is null");
        }


    }
}
