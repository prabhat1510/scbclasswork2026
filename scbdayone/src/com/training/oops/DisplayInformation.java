package com.training.oops;

public class DisplayInformation {
    public void display(){
        System.out.println("Hello Good Afternoon All !!");
    }
    public void display(String s){
        System.out.println(s);
    }
    public int display(String name, String message){
        System.out.println("Hello "+name+" "+message);
        return 0;
    }
    /*public int display(String s){
        System.out.println("Hello "+s);
        return 0;
    }*/
}
