package com.training.functionalinterfaceex.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    //Helper static method for Type 1 -- Reference to a static method
    public static int appendAndCount(String a , String b){
        return (a+b).length();
    }

    //Helper instance method for Type 2 -- Reference to an instance method of a particular object
    public void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        //Type 1: className::staticMethodName
        BiFunction<String,String,Integer> staticRef = MethodReferenceDemo::appendAndCount;
        Integer length = staticRef.apply("Hello","World");
        System.out.println(length);
        //Type 2: objectReference :: instanceMehtodName
        MethodReferenceDemo demo = new MethodReferenceDemo();
        List<String> frameworkList= Arrays.asList("Spring","Angular","Hibernate");
        frameworkList.forEach(demo::printMessage);
        //Type 3: Reference to an Instance method of an arbitrary object of a particular type
        Function<String,String> arbitraryRef= String::toLowerCase;
        System.out.println(arbitraryRef.apply("Hope you all are enjoying not getting bored!!!"));
        //Type 4: Reference to a Constructor
        Supplier<List<String>> constructorRef = ArrayList::new;
        List<String> newList = constructorRef.get();
        newList.add("Constructor Entry");
        System.out.println("Constructor List: "+newList);

    }

}
