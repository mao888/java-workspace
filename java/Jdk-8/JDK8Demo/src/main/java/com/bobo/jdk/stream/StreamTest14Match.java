package com.bobo.jdk.stream;

import com.bobo.jdk.lambda.domain.Person;

import java.util.stream.Stream;

public class StreamTest14Match {

    public static void main(String[] args) {
        boolean b = Stream.of("1", "3", "3", "4", "5", "1", "7")
                .map(Integer::parseInt)
                //.allMatch(s -> s > 0)
                //.anyMatch(s -> s >4)
                .noneMatch(s -> s > 4)
                ;
        System.out.println(b);
    }
}
