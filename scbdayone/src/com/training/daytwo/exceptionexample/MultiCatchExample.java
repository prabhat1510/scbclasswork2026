package com.training.daytwo.exceptionexample;

public class MultiCatchExample {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            //a[6]=15;
            //a[5]=30/0;
            String s = null;
            s.length();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Good Afternoon All!-- Finally Execution");
        }
        System.out.println("After the try catch finally block");
    }
}
