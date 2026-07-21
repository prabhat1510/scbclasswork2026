package com.training.daytwo.exceptionexample;

public class ExceptionPropagationEx {
    public static void main(String[] args) {
        try {
            calculation();
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException  e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally block");
        }
        System.out.println("After the try catch finally block");
    }
    public static void calculation() throws ArithmeticException,ArrayIndexOutOfBoundsException{

        calculation(15);
        int data=10/0;

    }
    public static void calculation(int data) throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[2];
        arr[3] = data;
    }
}
