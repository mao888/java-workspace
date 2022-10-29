package com.bobo.jdk.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamTest06 {

    public static void main(String[] args) {
        Stream<String> a1 = Stream.of("a1", "a2", "a3");
        a1.filter(s->{
            System.out.println("-----");
            return s.contains("a");})
        .forEach(System.out::println);
        ;

        System.out.println("------------>");
    }
}
