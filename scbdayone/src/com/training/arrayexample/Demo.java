package com.training.arrayexample;

public class Demo {
    public static void main(String[] args) {
        int arrOfNumbers[]= new int[]{34,21,2,66,567};
        System.out.println(arrOfNumbers.length);
        System.out.println(arrOfNumbers[0]);
        System.out.println(arrOfNumbers[1]);
        System.out.println("*****************");
        for(int i=0;i<arrOfNumbers.length;i++){
            System.out.println(arrOfNumbers[i]);//Accessing array elements using index
        }
        //for each num in arrOfNumbers
        for(int num:arrOfNumbers){
            //execute below statement
            System.out.println(num);
        }
    }
}
