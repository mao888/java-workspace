package com.bobo.jdk.stream;

import java.util.stream.Stream;

public class StreamTest08Filter {

    public static void main(String[] args) {
         Stream.of("a1", "a2", "a3","bb","cc","aa","dd")
                 .filter((s)->s.contains("a"))
                 .forEach(System.out::println);

    }
}
