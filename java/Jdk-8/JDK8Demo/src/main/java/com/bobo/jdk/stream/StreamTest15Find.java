package com.bobo.jdk.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest15Find {

    public static void main(String[] args) {

        Optional<String> first = Stream.of("1", "3", "3", "4", "5", "1", "7").findFirst();
        System.out.println(first.get());

        Optional<String> any = Stream.of("1", "3", "3", "4", "5", "1", "7").findAny();
        System.out.println(any.get());
    }
}
