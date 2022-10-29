package com.bobo.jdk.stream;

import java.util.stream.Stream;

public class StreamTest10Skip {

    public static void main(String[] args) {
         Stream.of("a1", "a2", "a3","bb","cc","aa","dd")
                 .skip(3)
                 .forEach(System.out::println);

    }
}
