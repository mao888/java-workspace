package com.bobo.jdk.stream;

import java.util.stream.Stream;

public class StreamTest08Count {

    public static void main(String[] args) {
        long count = Stream.of("a1", "a2", "a3").count();
        System.out.println(count);
    }
}
