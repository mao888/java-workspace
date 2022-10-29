package com.bobo.jdk.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest20Concat {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a","b","c");
        Stream<String> stream2 = Stream.of("x", "y", "z");
        // 通过concat方法将两个流合并为一个新的流
        Stream.concat(stream1,stream2).forEach(System.out::println);
    }
}
