package com.training.streamapiex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 1. Data
        // 2. Collection is a source of data of which stream created
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = numbers.stream();// Stream is created
        stream.forEach(System.out::println);// using forEach we are doing terminal operation on stream

        Stream<Integer> strm = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        strm.forEach(System.out::println);
        List<String> words=Arrays.asList("Hello", "All", "You", "Should", "Now", "Start", "Loving", "Java", "Programming");
        Stream<String> wordsStream = words.stream();
        wordsStream.forEach(System.out::println);

        // Lets create a stream
        Stream<Integer> streamOfInteger = Stream.of(15,2,4,6,10, 20, 30);// stream created
        System.out.println(streamOfInteger);
        System.out.println("**************************");
        //We want to filter out integers less than 30
        //
        List<Integer> newListOfIntegers = streamOfInteger
                    .filter(x->x<30) //Operations on stream -- intermediate operation
                    .toList();//In java 16 and above toList method in Stream API is there and its for terminal operation
        System.out.println(newListOfIntegers);
        //Error -- stream is already closed or operated upon
        //streamOfInteger.forEach(System.out::println);
        /**
         * A stream can be obtained from sources like arrays or
         * collections using stream()
         * As stream doesn’t store data, we need to define the source
         * to perform stream operations.
         * This is done by either creating stream or obtaining stream from
         * array/collections
         */
        Integer[] values = new Integer[] { 10, 20, 30 }; // source of stream
        Stream<Integer> streamValues = Arrays.stream(values);// stream created
        // If you are using Java whose version is less than Java16
        //please use collect
        // method to stream into a collection
        List<Integer> integersList= streamValues.filter(x->x>10).collect(Collectors.toList());
        System.out.println(integersList);
    }
}
